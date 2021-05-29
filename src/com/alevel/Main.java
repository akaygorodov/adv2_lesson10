package com.alevel;

public class Main {

    public static void main(String[] args) {
        Report report = Report.builder().header("Header").body("Body").build();
        Report report1 = report.toBuilder().footer("Footer").build();
        Pow toPow = (int number, int pow) -> {
            int newNum = number;
            if (pow > 0) {
                for (int i = 1; i < pow; i++) {
                    newNum *= number;
                }
            } else if (pow < 0) {
                pow = -1 * pow;
                for (int i = 1; i < pow; i++) {
                    newNum *= number;
                }
                return 1.0 / newNum;
            } else {
                return 1;
            }
            return (double) newNum;
        };
        System.out.printf(String.valueOf(toPow.pow(5, 3)));
    }
}
