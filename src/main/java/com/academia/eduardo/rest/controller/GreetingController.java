package com.academia.eduardo.rest.controller;

import com.academia.eduardo.rest.entity.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping(path="/greetings")
    public ResponseEntity<Greeting> greet() {
        return ResponseEntity.status(HttpStatus.OK).body(new Greeting("Hola Java Academy"));
    }

}
