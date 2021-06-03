package com.alevel;

import static com.alevel.PlanetEnum.*;

public class Main {

    public static void main(String[] args) {
        Report report = Report.builder().header("Header").body("Body").build();
        System.out.println(report.toString());

        PowInterface powInterface;
        powInterface = (number, pow) -> {
            int res = 1;
            for (int i = 0; i < pow; i++) {
                res *= number;
            }
            return res;
        };
        System.out.println(powInterface.pow(5, 3));

        int satellites = URANUS.getNaturalSatellites();
        System.out.println("Chosen planet has " + satellites + " natural satellites");
    }
}
