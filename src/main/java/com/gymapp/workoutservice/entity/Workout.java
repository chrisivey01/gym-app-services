package com.gymapp.workoutservice.entity;

import com.gymapp.workoutservice.enumeration.WorkoutType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    int week;
    int weight;
    int no_of_sets;
    WorkoutType type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNo_of_sets() {
        return no_of_sets;
    }

    public void setNo_of_sets(int no_of_sets) {
        this.no_of_sets = no_of_sets;
    }

    public WorkoutType getType() {
        return type;
    }

    public void setType(WorkoutType type) {
        this.type = type;
    }

}
