public enum PlanetEnum {
    MERCURY(0),
    VENUS(0),
    EARTH(1),
    MARS(2),
    JUPITER(79),
    SATURN(82),
    URANUS(27),
    NEPTUNE(14)
    ;

    int satellites;

    PlanetEnum(int satellites) {
        this.satellites = satellites;
    }

    public int getSatellites() {
        return satellites;
    }
}
