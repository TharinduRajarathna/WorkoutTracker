package io.tharindu.workouttracker.workouttemplate.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class WorkoutTemplateResource {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("hello")
    public String sayHello() {
        return "Hello WorkoutTemplate";
    }

    @GetMapping("callExercise")
    public String callExercise() {
        String response = restTemplate.getForObject("http://EXERCISE-SERVICE/hello", String.class);
        return response;
    }
}
