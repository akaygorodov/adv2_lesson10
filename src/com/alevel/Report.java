package com.alevel;

import java.util.Objects;

public class Report extends AbstractReport {

    private String body;

    private Report(String header, String body, String footer) {
        super.header = header;
        this.body = body;
        super.footer = footer;
    }

    public String getBody() {
        return body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this == null) return false;
        if (getClass() != o.getClass()) return false;
        if (body != ((Report) o).getBody() || super.header != ((Report) o).getHeader() || getFooter() != ((Report) o).getFooter())
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), body);

    }

    public static ReportBuilder builder() {
        return new ReportBuilder();
    }

    public ReportBuilder toBuilder() {
        return new ReportBuilder(super.header, this.body, super.footer);
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
}
