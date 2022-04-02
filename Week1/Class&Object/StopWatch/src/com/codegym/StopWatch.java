package com.codegym;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime() {
        return this.startTime;
    }
    public LocalTime getEndTime() {
        return this.endTime;
    }

    public void setStartTime() {
        this.startTime = LocalTime.now();
    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void end() {
        this.endTime = LocalTime.now();
    }

    public long getElapsedTime() {
        return ChronoUnit.MILLIS.between(this.startTime,this.endTime);
    }
}

