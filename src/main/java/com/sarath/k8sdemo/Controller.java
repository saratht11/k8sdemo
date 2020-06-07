package com.sarath.k8sdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Controller {
    @GetMapping("/")
    public ResponseEntity<String> getIndex() {
        return ResponseEntity.ok("Success");
    }

    @GetMapping("/getDate")
    public ResponseEntity<String> getDate() {
        return ResponseEntity.ok(new Date().toString());
    }
}
