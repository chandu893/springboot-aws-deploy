package com.example.springbootawsdeploy;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/demo")


public class TestController {
    @GetMapping("/data")
    public String getData() {
        return "First message fron AWS ECS";
    }
}
