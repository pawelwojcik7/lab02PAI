package com.example.lab11;

import java.io.Serializable;

import static java.lang.Math.pow;

public class LoanBean implements Serializable{
    private double kwota =1000;
    private double oprocentowanie = 10;
    private double ileRat=10;

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public double getOprocentowanie() {
        return oprocentowanie;
    }

    public void setOprocentowanie(double oprocentowanie) {
        this.oprocentowanie = oprocentowanie;
    }

    public double getIleRat() {
        return ileRat;
    }

    public void setIleRat(double ileRat) {
        this.ileRat = ileRat;
    }

    public double getRata(Double k, Double p, Double n){
        double wynik= (k * p)/(1-(1/(pow((1+p),n))));
        return wynik;
    }
}
