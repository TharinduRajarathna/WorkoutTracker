package io.tharindu.workouttracker.exercise.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @ElementCollection(targetClass = MuscleGroup.class)
    @JoinTable(name = "exercise_muscle_group", joinColumns = @JoinColumn(name = "exerciseId"))
    @Column(name = "muscle_group", nullable = false)
    @Enumerated(EnumType.STRING)
    private List<MuscleGroup> targetMuscleGroups;

    @ElementCollection(targetClass = Category.class)
    @JoinTable(name = "exercise_category", joinColumns = @JoinColumn(name = "exerciseId"))
    @Column(name = "category", nullable = false)
    @Enumerated(EnumType.STRING)
    private List<Category> categories;

}
