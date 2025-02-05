package io.xream.x7.demo.bean;

import x7.core.repository.X;

public class Transformed  {

    @X.Key
    private String id;
    private String alia;
    private long originId;
    private String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlia() {
        return alia;
    }

    public void setAlia(String alia) {
        this.alia = alia;
    }

    public long getOriginId() {
        return originId;
    }

    public void setOriginId(long originId) {
        this.originId = originId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transformed{" +
                "id='" + id + '\'' +
                ", alia='" + alia + '\'' +
                ", originId='" + originId + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
