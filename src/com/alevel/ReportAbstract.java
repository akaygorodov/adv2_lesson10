package com.alevel;

public abstract class ReportAbstract {

    protected String header;
    protected String footer;

    protected ReportAbstract(String header, String footer) {
        this.header = header;
        this.footer = footer;
    }

    public abstract String getHeader();
    public abstract String getFooter();
}
