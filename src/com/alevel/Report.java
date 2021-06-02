package com.alevel;

public class Report extends ReportAbstract{

    private String body;

    private Report(String header, String footer, String body) {
        super(header, footer);
        this.body = body;
    }

    @Override
    public String toString() {
        return "Report{" +
                "body='" + body + '\'' +
                ", header='" + header + '\'' +
                ", footer='" + footer + '\'' +
                '}';
    }

    public static ReportBuilder builder() {
        return new ReportBuilder();
    }

    public ReportBuilder toBuilder() {
        return new ReportBuilder(getHeader(), this.body, getFooter());
    }

    public String getBody() {
        return body;
    }

    @Override
    public String getHeader() {
        return header;
    }

    @Override
    public String getFooter() {
        return footer;
    }

    public static class ReportBuilder  {
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
            return new Report(this.header, this.footer, this.body);
        }
    }

}
