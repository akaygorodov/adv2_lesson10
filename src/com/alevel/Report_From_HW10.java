package com.alevel;

import java.util.Objects;

public class Report_From_HW10 {
    private String body;
    private String header;
    private String footer;


    private Report_From_HW10(String header, String body, String footer) {
        this.body = body;
        this.header = header;
        this.footer = footer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report_From_HW10 that = (Report_From_HW10) o;
        return Objects.equals(body, that.body) && Objects.equals(header, that.header) && Objects.equals(footer, that.footer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, header, footer);
    }

    public Report_From_HW10() {

    }

    public static Report_From_HW10 builder() {
        return new Report_From_HW10();
    }

    public Report_From_HW10 toBuilder() {
        return new Report_From_HW10(this.header, this.body, this.footer);
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

        public Report_From_HW10.ReportBuilder header(String header) {
            this.header = header;
            return this;
        }

        public Report_From_HW10.ReportBuilder body(String body) {
            this.body = body;
            return this;
        }

        public Report_From_HW10.ReportBuilder footer(String footer) {
            this.footer = footer;
            return this;
        }

        public Report_From_HW10 build() {
            return new Report_From_HW10(this.header, this.body, this.footer);
        }
    }
}
