package com.alevel;

public enum PlanetEnum {
    MERCURY(0),
    VENUS(0),
    EARTH(1),
    MARS(2),
    JUPITER(63),
    SATURN(62),
    URANUS(27),
    NEPTUNE(13);
    int satellites;

    PlanetEnum(int satellites) {
        this.satellites = satellites;
    }

    public int getSatellites() {
        return satellites;
    }
}
