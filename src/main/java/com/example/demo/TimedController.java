package com.example.demo;


import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Timed
public class TimedController {
    @GetMapping("/timed")
    public String sayTimed() throws  InterruptedException{

        Thread.sleep((long)(Math.random()*5000)); // it will randomly take time max 5 secs
        return "Hello";
    }
}
