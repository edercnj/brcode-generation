package com.br.valhalla.brcodegeneration.log.annotation;

import com.br.valhalla.brcodegeneration.log.enumeration.LogType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LogStartupApplication {
    LogType logType() default LogType.GENERAL;
}

