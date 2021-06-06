package com.alevel;

public class ReportAbstract {
    protected String header;
    protected String footer;

    ReportAbstract(String header, String footer) {
        this.header = header;
        this.footer = footer;
    }
}
