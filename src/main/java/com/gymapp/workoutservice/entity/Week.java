package com.gymapp.workoutservice.entity;

import javax.persistence.Column;

public class Week extends Workout{
    @Column(name = "week_list")
    int week;

    @Column(name = "week_day")
    String weekDay;

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }
}
