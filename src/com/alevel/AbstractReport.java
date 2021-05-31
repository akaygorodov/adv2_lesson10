package com.alevel;

abstract public class AbstractReport {
    protected String header;
    protected String footer;

    AbstractReport(String header, String footer) {
        this.header = header;
        this.footer = footer;
    }
}
