package com.anhlongvt.model;

public enum Type {
    NORMAL("Normal"),
    FIBONACCI("Fibonacci"),
    PRIME("Prime");

    private String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}