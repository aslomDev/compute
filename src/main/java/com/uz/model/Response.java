package com.uz.model;

import lombok.Data;

@Data
public class Response {

    private String name;

    private Double area;

    private Double perimeter ;
    private Double circles ;

    public Response(String name, Double area, Double perimeter, Double circles) {
        this.name = name;
        this.area = area;
        this.perimeter = perimeter;
        this.circles = circles;
    }
}
