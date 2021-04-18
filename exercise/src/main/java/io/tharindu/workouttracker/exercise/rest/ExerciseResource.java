package io.tharindu.workouttracker.exercise.rest;

import io.tharindu.workouttracker.exercise.domain.Exercise;
import io.tharindu.workouttracker.exercise.service.ExerciseService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercises")
public class ExerciseResource {

    @Autowired
    ExerciseService exerciseService;

    @GetMapping()
    public List<Exercise> getAllExercises() {
        return exerciseService.getAllExercises();
    }

    @GetMapping("/{id}")
    public Exercise getExerciseById(@NonNull @PathVariable("id") long id) {
        return exerciseService.getExerciseById(id);
    }

    @PostMapping()
    public Exercise getExerciseById(@RequestBody Exercise exercise) {
        return exerciseService.addExercise(exercise);
    }

    @PutMapping("/{id}")
    public Exercise updateExercise(@NonNull @PathVariable("id") long id, @RequestBody Exercise exercise) throws IllegalAccessException {
        if (id != exercise.getId()) {
            throw new IllegalAccessException();
        }
        return exerciseService.updateExercise(exercise);
    }

    @DeleteMapping("/{id}")
    public void deleteExerciseById(@NonNull @PathVariable("id") long id) {
        exerciseService.deleteExerciseById(id);
    }
}
