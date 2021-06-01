package com.alevel;
public abstract class AbstractReport {
    private String header;
    private String footer;

    public AbstractReport(String header, String footer) {
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
