package com.uz.service;

import com.uz.model.ApiResponse;
import com.uz.model.Model;
import com.uz.model.Response;
import org.springframework.stereotype.Service;

@Service
public class TaskService {


    public Response circle(Model model){
        Circle circle = new Circle(model.getX());
        return new Response("Круг: ", circle.area, circle.perimeter, circle.circles);
    }

    public ApiResponse rectangle(Model model){
        Rectangle rectangle= new Rectangle(model.getX(), model.getY());
        return new ApiResponse("Прямоугольник: ", rectangle.area, rectangle.perimeter);
    }

    public ApiResponse square(Model model){
        Square square = new Square(model.getX());
        return new ApiResponse("Квадрат: ", square.area, square.perimeter);
    }

    public ApiResponse triangle(Model model){
        Triangle triangle = new Triangle(model.getX(), model.getY(), model.getZ());
        return new ApiResponse("Треугольник: ", triangle.area, triangle.perimeter);
    }

}
