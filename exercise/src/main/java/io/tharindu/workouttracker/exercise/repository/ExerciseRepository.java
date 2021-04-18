package io.tharindu.workouttracker.exercise.repository;

import io.tharindu.workouttracker.exercise.domain.Exercise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExerciseRepository extends CrudRepository<Exercise, Long> {

    List<Exercise> findAll();

}
