package com.gymapp.workoutservice.repository;

import com.gymapp.workoutservice.entity.Workout;
import org.springframework.data.repository.CrudRepository;

public interface WorkoutRepository extends CrudRepository<Workout, Integer> {
}
