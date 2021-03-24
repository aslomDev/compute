package com.uz.service;


/// kvadrat
public class Square extends Figura{
    private Double x;


    public Square(Double x) {
        this.x = x;
        calc();
    }


    @Override
    protected void calc() {
        area = x * x;
        perimeter = 4 * x;
    }
}
