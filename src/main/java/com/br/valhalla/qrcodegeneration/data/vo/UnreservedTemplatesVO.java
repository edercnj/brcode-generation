package com.br.valhalla.qrcodegeneration.data.vo;

import com.br.valhalla.qrcodegeneration.data.Entity.DataObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class UnreservedTemplatesVO {

    private int id;
    private int length;
    private List<DataObjectVO> tags;

    public int getId() {
        return id;
    }

    public int getLength() {
        return length;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List<DataObjectVO> getTags() {
        return tags;
    }

    public void setTags(List<DataObjectVO> tags) {
        this.tags = tags;
    }
}
