package com.company;

import java.util.Map;

public enum Country {
    RUSSIA("Russian","RU",1.5),
    UKRAINE("Ukrainian","UA",0.15),
    USA("English","US",20.9);
    //Poland 0.59

    public String name;
    public String code;
    public double gdp;




    Country(String name, String code, double gdp) {
        this.name = name;
        this.code = code;
        this.gdp = gdp;
    }

    public double getGdp() {
        return gdp*4;
    }
}
