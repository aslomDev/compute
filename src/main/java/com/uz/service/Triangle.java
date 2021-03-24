package com.uz.service;


/// uch burchak
public class Triangle extends Figura{

    private Double x;
    private Double y;
    private Double z;

    public Triangle(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        calc();
    }


    @Override
    protected void calc() {
        perimeter = x + y + z;

        Double p = perimeter / 2.0;
        area = Math.sqrt(p * (p - x) * (p - y) * (p - z));    }
}
