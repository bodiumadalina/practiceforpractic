package com.example.practice;

enum Masseinheitenum{
    FAHRENHEIT,
    CELSIUS
}

enum Monatenum{
    JAN,
    FEB,
    MAR,
    APR,
    MAY,
    JUN,
    JUL,
    AUG,
    SEP,
    OCT,
    NOV,
    DEC;
}

public class Temperatur {
    int Wert;
    String Masseinheit;
    String Monat;

    public Temperatur(int wert, String masseinheit, String monat) {
        Wert = wert;
        Masseinheit = masseinheit;
        Monat = monat;
    }


    @Override
    public String toString() {
        return "Temperatur{" +
                "Wert=" + Wert +
                ", Masseinheit='" + Masseinheit + '\'' +
                ", Monat='" + Monat + '\'' +
                '}';
    }

    public int getWert() {
        return Wert;
    }

    public void setWert(int wert) {
        Wert = wert;
    }

    public String getMasseinheit() {
        return Masseinheit;
    }

    public void setMasseinheit(String masseinheit) {
        Masseinheit = masseinheit;
    }

    public String getMonat() {
        return Monat;
    }

    public void setMonat(String monat) {
        Monat = monat;
    }
}
