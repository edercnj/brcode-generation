package com.br.valhalla.brcodegeneration.log.core;


import com.br.valhalla.brcodegeneration.log.exception.ManagedException;
import com.br.valhalla.brcodegeneration.log.exception.NoManagedException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLog {

    private Logger log;

    public Logger getLog() { return log; }

    public void setLog(Logger log) { this.log = log; }

    public AspectLog() {
        this.setLog(LoggerFactory.getLogger(AspectLog.class));
    }

    @Around("@annotation(com.br.valhalla.brcodegeneration.log.annotation.LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {

        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;
        log.info(joinPoint.getSignature() + " executed in " + executionTime + "ms");

        return proceed;
    }

    @AfterThrowing(value = "@annotation(com.br.valhalla.brcodegeneration.log.annotation.LogException)", throwing = "e")
    public void logException(JoinPoint joinPoint, Exception e) {
        if (e instanceof ManagedException) {
            ManagedException ex = (ManagedException) e;
            log.warn(String.format("Launch Managed Exception: {%s} - method: {%s} - message: {%s}", e.getClass().getName(), joinPoint.getSignature(), ex.getDebugMessage()));
        } else if (e instanceof NoManagedException) {
            log.error(String.format("Launch NO Managed Exception: {%s} - method: {%s} - message: {%s}", e.getClass().getName(), joinPoint.getSignature(), ((NoManagedException) e).getDebugMessage()));
        } else {
            log.error(String.format("Launch NO Managed Exception: {%s} - method: {%s} - message: {%s}", e.getClass().getName(), joinPoint.getSignature(), e.getCause().getMessage()));
        }
    }

    @Before(value = "@annotation(com.br.valhalla.brcodegeneration.log.annotation.LogMethodCall)")
    public void logMethodCall(JoinPoint joinPoint) {

        if (joinPoint.getArgs().length > 0) {
            StringBuilder parameters = new StringBuilder();
            for (int i = 0; i < joinPoint.getArgs().length; i++) {
                parameters.append(String.format("%s=%s ", joinPoint.getArgs()[i].getClass().getSimpleName(), joinPoint.getArgs()[i].toString()));
            }
            log.info(String.format("Calling method: {%s} - with parameters: {%s}", joinPoint.getSignature(), parameters));

        } else {
            log.info(String.format("Calling method: {%s} - with parameters: {null}", joinPoint.getSignature()));
        }
    }

    @AfterReturning(value = "@annotation(com.br.valhalla.brcodegeneration.log.annotation.LogMethodReturn)", returning = "result")
    public void logMethodReturn(JoinPoint joinPoint, Object result) throws Exception {
        try {
            if (result != null)
                log.info(String.format("Method Return: {%s} - return {%s}", joinPoint.getSignature(), result.toString()));
            else
                log.info(String.format("Method Return: {%s} - return {null}", joinPoint.getSignature()));
        } catch (Exception e) {
            log.error(String.format("Method {%s} launch exception {%s}", joinPoint.getSignature(), e.getClass().getName()));
            throw new Exception(e.getMessage());
        }
    }

    @Before(value = "@annotation(com.br.valhalla.brcodegeneration.log.annotation.LogStartupApplication)")
    public void logStartupInformation() {
        log.info("------------------------------Starting Application------------------------------");
        log.info("                            <<Application Information>>                         ");
        log.info(String.format("<< %s >>", new Application().toString()));
        log.info("                            <<System Information>>                              ");
        log.info(String.format("<< %s >>", new SystemInformation().toString()));
        log.info("                            <<Server Information>>                              ");
        log.info(String.format("<< %s >>", new Server().toString()));
        log.info("--------------------------------------------------------------------------------");
    }
}