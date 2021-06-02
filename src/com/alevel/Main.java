package com.alevel;

public class Main {

    public static void main(String[] args) {
        Report report = Report.builder().header("Header").body("Body").build();
        Report report1 = report.toBuilder().footer("Footer").build();

        System.out.printf("");

        Pow pow = (number, pow1) -> {
            int res = 1;
            for (int i = 0; i < pow1; i++) {
                res *= number;
            }
            return res;
        };
        System.out.println(pow.pow(2, 3));
    }
}


