package com.alevel;

import java.util.Objects;

public class Report extends ReportAdd {
    private final String body;

    Report(String header, String body, String footer) {
        super(header, footer);
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public static ReportBuilder builder() {
        return new ReportBuilder();
    }

    public ReportBuilder toBuilder() {
        return new ReportBuilder(super.getHeader(), this.body, super.getFooter());
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
        if (getClass() != o.getClass()) return false;
       // if (o == null) return false;
        return body.equals(((Report) o).getBody()) && super.header.equals(((Report) o).getHeader()) && super.footer.equals(((Report) o).getFooter());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), body);

    }
}

abstract class ReportAdd {
    public final String header;
    public final String footer;

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }

    public ReportAdd(String header, String footer) {
        this.header = header;
        this.footer = footer;
    }
}
