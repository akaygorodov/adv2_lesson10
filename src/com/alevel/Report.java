package com.alevel;

import java.util.Objects;

public class Report extends AbstractClass {

    private String body;

    private Report(String header, String body, String footer) {
        super(header, footer);
        this.body = body;
    }

    public static ReportBuilder builder() {
        return new ReportBuilder();
    }

    public ReportBuilder toBuilder() {
        return new ReportBuilder(getHeader(), this.body, getFooter());
    }

    @Override
    public String toString() {
        return "Report{" +
                "header='" + getHeader() + '\'' +
                ", footer='" + getFooter() + '\'' +
                ", body='" + body + '\'' +
                '}';
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
            return new Report(this.header, this.body, this.footer);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report report = (Report) o;
        return body.equals(report.body)
                && getFooter().equals(report.getFooter())
                && getHeader().equals(report.getHeader());
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, getFooter(), getHeader());
    }
}
