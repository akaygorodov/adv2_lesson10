package com.alevel;

public abstract class AbstractClass {
    private String header;
    private String footer;

    protected AbstractClass(String header, String footer) {
        this.header = header;
        this.footer = footer;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }
}