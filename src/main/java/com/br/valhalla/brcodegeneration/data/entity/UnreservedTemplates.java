package com.br.valhalla.brcodegeneration.data.entity;

import java.util.List;

public class UnreservedTemplates {

    private int id;
    private int length;
    private List<DataObject> tags;

    public int getId() {
        return id;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {

        StringBuilder value = new StringBuilder();
        for (int i = 0; i < tags.size(); i++) {
            value.append(tags.get(i).toString());
        }

        return String.format("%02d", getId())  // TAG
                + String.format("%02d", getLength())
                + value; // VALUE
    }

    public UnreservedTemplates(int id, int length, List<DataObject> tags) {
        this.id = id;
        this.length = length;
        this.tags = tags;
    }
}
