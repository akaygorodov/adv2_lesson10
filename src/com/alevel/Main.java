package com.alevel;

public class Main {

    public static void main(String[] args) {

        Report.ReportBuilder reportTest = Report.builder().body("Sample text").header("Header").footer("footer");

        System.out.println(reportTest.toString());


        Pow powTest;
        int numberTest = 3;
        int powNumberTest = 3;
        powTest = (x, y) -> {
            int num = numberTest;
            for (int i = 0; i < powNumberTest - 1; i++) {
                num = numberTest * num;
            }
            return num;
        };

        int resultTest = powTest.pow(numberTest, numberTest);
        System.out.println(resultTest);

    }
}
