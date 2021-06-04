package ua.tarasov.adv2_lesson10;

@FunctionalInterface
public interface ReportInterface {

    String header = "Header";
    String footer = "Footer";

    String getBody(String body);

    default String getHeader() {
        return header;
    }

    default String getFooter() {
        return footer;
    }

}
