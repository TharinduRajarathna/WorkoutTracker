package io.tharindu.workouttracker.workouttemplate.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WorkoutTemplateResource {

    @GetMapping("hello")
    public String sayHello() {
        return "Hello WorkoutTemplate";
    }
}
