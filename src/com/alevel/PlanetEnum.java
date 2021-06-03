package com.alevel;

public enum PlanetEnum {
    MERCURY(0),
    VENUS(0),
    EARTH(1),
    MARS(2),
    JUPITER(79),
    SATURN(82),
    URANUS(27),
    NEPTUNE(14),
    ;

    int satelliteQuantity;
    PlanetEnum(int satelliteQuantity){
        this.satelliteQuantity = satelliteQuantity;;
    }

    int getSatelliteQuantity(){
        return satelliteQuantity;
    }


}
