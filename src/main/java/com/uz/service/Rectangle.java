package com.uz.service;

///  turtburchak
public class Rectangle extends Figura{
    private Double x;
    private Double y;

    public Rectangle(Double x, Double y) {
        this.x = x;
        this.y = y;
        calc();
    }



    @Override
    protected void calc() {
        area = x * y;
        perimeter = 2.0 * (x + y);
    }
}
