package com.amalitech.assignmentservice.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/v1/assignments")
public class assignmentController {
    
    @GetMapping(path = "/health")
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("Ok", HttpStatus.OK);
    }
}
