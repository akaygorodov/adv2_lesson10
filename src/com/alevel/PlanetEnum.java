package com.alevel;

public enum PlanetEnum {
    EARTH (1),
    MARS (2),
    JUPITER (79),
    MERCURY (0),
    VENUS (0),
    SATURN (82),
    URANUS (27),
    NEPTUNE (14),

    ;

    private final int countOfSatellite;


    PlanetEnum(int countOfSatellite) {
        this.countOfSatellite = countOfSatellite;
    }

    public int getSatellite() {
        return countOfSatellite;
    }

    @Override
    public String toString() {
        return name() +
                ", колличество спуников = " + countOfSatellite +
                '}';
    }
}
}
