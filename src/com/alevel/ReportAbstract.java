package com.alevel;

public abstract class ReportAbstract {
    private String header;
    private String footer;

    protected ReportAbstract(String header, String footer){
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
