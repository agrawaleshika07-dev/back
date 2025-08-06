package com.example.eshcld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {
    @GetMapping("/aws")
    public String aws(){
        return "AWS Resources Accessed";
    }
}
