package io.tharindu.workouttracker.exercise.service;

import io.tharindu.workouttracker.exercise.domain.Exercise;
import io.tharindu.workouttracker.exercise.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    public Exercise addExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    public Exercise getExerciseById(long id) {
        return exerciseRepository.findById(id).orElse(null);
    }

    public Exercise updateExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    public void deleteExerciseById(long id) {
        exerciseRepository.deleteById(id);
    }

    public List<Exercise> getAllExercises() {
        return new ArrayList(exerciseRepository.findAll());
    }
}
