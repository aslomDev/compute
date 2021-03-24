package com.uz.controller;

import com.uz.model.ApiResponse;
import com.uz.model.Model;
import com.uz.model.Response;
import com.uz.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TaskController {
    @Autowired private TaskService taskService;

    @GetMapping("/cricle")
    public HttpEntity<?> cricle(@RequestBody Model model){
        Response response = taskService.circle(model);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/rectangle")
    public HttpEntity<?> rectangle(@RequestBody Model model){
        ApiResponse response = taskService.rectangle(model);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/square")
    public HttpEntity<?> square(@RequestBody Model model){
        ApiResponse response = taskService.square(model);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/triangle")
    public HttpEntity<?> triangle(@RequestBody Model model){
        ApiResponse response = taskService.triangle(model);
        return ResponseEntity.ok(response);
    }



}
