package com.uz.service;


/// dumoloq aylana
public class Circle extends Figura {
    private Double r;

    public Circle(double r) {
        this.r = r;
        calc();
    }


    @Override
    protected void calc() {
        area = Math.PI * r * r;
        perimeter = 2.0 * Math.PI * r;
        circles = r * 2;
    }
}
