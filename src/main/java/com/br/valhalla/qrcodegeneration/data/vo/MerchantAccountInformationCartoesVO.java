package com.br.valhalla.qrcodegeneration.data.vo;

import com.br.valhalla.qrcodegeneration.data.entity.DataObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class MerchantAccountInformationCartoesVO extends DataObjectVO {

}
