package com.gymapp.workoutservice.entity;

import com.gymapp.workoutservice.entity.Sets;
import com.gymapp.workoutservice.enumeration.WorkoutType;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Workout {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "type")
    WorkoutType type;

    //    @Column(name = "set")

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public WorkoutType getType() {
        return type;
    }

    public void setType(WorkoutType type) {
        this.type = type;
    }




    //    public List<Integer> getWeekList() {
//        return weekList;
//    }
//
//    public void setWeekList(List<Integer> weekList) {
//        this.weekList = weekList;
//    }
//
//    public List<String> getWeekDayList() {
//        return weekDayList;
//    }
//
//    public void setWeekDayList(List<String> weekDayList) {
//        this.weekDayList = weekDayList;
//    }

//    public List<Integer> getSetList() {
//        return setList;
//    }
//
//    public void setSetList(List<Integer> setList) {
//        this.setList = setList;
//    }

//    public int getReps() {
//        return reps;
//    }
//
//    public void setReps(int reps) {
//        this.reps = reps;
//    }
//
//    public int getWeight() {
//        return weight;
//    }
//
//    public void setWeight(int weight) {
//        this.weight = weight;
//    }


}
