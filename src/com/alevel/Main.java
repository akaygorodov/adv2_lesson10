package com.alevel;

public class Main {

    public static void main(String[] args) {
        Report report = Report.builder().header("Header").body("Body").build();
        Report report1 = report.toBuilder().footer("Footer").build();

        System.out.println(report);

        PowInterface power;
        power = (number, powerValue) -> {
            int result = 1;
            for (int i = 0; i < powerValue; i++) {
                result = (result * number);
            }
            return result;
        };
        System.out.println(power.calcPower(0, 0));

    }
}
