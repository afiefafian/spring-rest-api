package com.jvmindonesia.restapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/callback")
public class CallbackController {
    @PostMapping
    public ResponseEntity<String> addNewCar(@RequestBody String bodyData) {
        System.out.println(bodyData);
        return new ResponseEntity<>(bodyData, HttpStatus.OK);
    }
}
