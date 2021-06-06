package com.alevel;

public enum PlanetEnum {
    MERCURY("mercury", 0),
    VENUS("venus", 0),
    EARTH("earth", 1),
    MARS("mars", 2),
    JUPITER("jupiter", 79),
    SATURN("saturn", 82),
    URANUS("uranus", 27),
    NEPTUNE("neptune", 14);

    String planet;
    int naturalSatellites;

    PlanetEnum(String planet, int naturalSatellites) {
        this.planet = planet;
        this.naturalSatellites = naturalSatellites;
    }

    public int getNaturalSatellites(){
       return naturalSatellites;
    }
}
