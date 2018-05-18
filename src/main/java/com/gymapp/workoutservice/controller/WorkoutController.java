package com.gymapp.workoutservice.controller;


import com.gymapp.workoutservice.entity.Workout;
import com.gymapp.workoutservice.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class WorkoutController {

    @Autowired
    WorkoutRepository workoutRepository;


    @PostMapping("/create-workout")
    public Workout createWorkout(@RequestBody Workout workout){
        return workoutRepository.save(workout);

    }

    @GetMapping("/get-workout")
    public List<Workout> getWorkouts(){
        return (List<Workout>)workoutRepository.findAll();
    }

}
