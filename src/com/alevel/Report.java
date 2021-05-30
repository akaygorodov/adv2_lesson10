package com.alevel;

public class Report extends ReportAbstract{

    private String header;
    private String body;
    private String footer;

    private Report(String body) {
        this.header = getHeader();
        this.body = body;
        this.footer = getFooter();
    }

    public static ReportBuilder builder() {
        return new ReportBuilder();
    }

    public ReportBuilder toBuilder() {
        return new ReportBuilder(this.header, this.body, this.footer);
    }

    public static class ReportBuilder {
        private String header;
        private String body;
        private String footer;

        public ReportBuilder() {
        }

        public ReportBuilder(String header, String body, String footer) {
            this.header = header;
            this.body = body;
            this.footer = footer;
        }

        public ReportBuilder header(String header) {
            this.header = header;
            return this;
        }

        public ReportBuilder body(String body) {
            this.body = body;
            return this;
        }

        public ReportBuilder footer(String footer) {
            this.footer = footer;
            return this;
        }

        public Report build() {
            return new Report(this.body);
        }
    }

}
