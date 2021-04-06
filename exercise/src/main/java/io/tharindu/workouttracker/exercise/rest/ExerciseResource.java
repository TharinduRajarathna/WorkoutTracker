package io.tharindu.workouttracker.exercise.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ExerciseResource {

    @GetMapping("hello")
    public String sayHello() {
        return "Hello";
    }
}
