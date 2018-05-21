package com.gymapp.workoutservice.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue("A")
public class Sets extends Workout {

    @Column(name = "set")
    int set;

    @Column(name = "reps")
    int reps;

    @Column(name = "weight")
    int weight;

//    public Sets(int set, int reps, int weight){
//        this.set = set;
//        this.reps = reps;
//        this.weight = weight;
//    }

    public int getSet() {
        return set;
    }

    public void setSet(int sets) {
        this.set = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
