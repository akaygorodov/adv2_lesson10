package com.alevel;

public enum PlanetEnum {
    Mercury(0),
    Earth(1),
    Saturn(82),
    Venus(0),
    Mars(2),
    Jupiter(79),
    Uranus(27),
    Neptune(14);
    int satellite;

    PlanetEnum( int satellite) {
        this.satellite = satellite;
    }
    public int findSatellite(){
        return satellite;
    }
}
