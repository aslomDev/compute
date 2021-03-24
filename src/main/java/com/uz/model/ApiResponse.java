package com.uz.model;

import lombok.Data;

@Data
public class ApiResponse {

    private String name;

    private Double area;

    private Double perimeter ;

    public ApiResponse(String name, Double area, Double perimeter ) {
        this.name = name;
        this.area = area;
        this.perimeter  = perimeter ;
    }


}
