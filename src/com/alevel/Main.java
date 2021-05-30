package com.alevel;

public class Main {
    public static void main(String[] args) {
        Report report = Report.builder().header("NewHeader").body("NewBody").footer("NewFooter").build();
        System.out.println(report.getHeader()+report.getFooter()+report.getBody());

        Pow calculate;
        calculate=(number, pow) -> {
            int j=number;
            for (int i = 1; i < pow; i++) {
                number*=j;
            }
            return number;
        };
        int result = calculate.pow(3,2);
        System.out.println(result);
    }
}

