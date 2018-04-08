package com.votesapp;

import java.util.Date;

public class Timestamp {

    public Long currentTime() {
        Long numericTime = new Date().getTime()/1000;
        return numericTime;
    }
    public Long addHour() {
        Long currentTime = this.currentTime();
        Long passedByHour = currentTime + 3600;
        return passedByHour;
    }
    public Long addDay() {
        Long currentTime = this.currentTime();
        Long passedByDay = currentTime + 86400;
        return passedByDay;
    }
    public Long addWeek() {
        Long currentTime = this.currentTime();
        Long passedByWeek = currentTime + 604800;
        return passedByWeek;
    }
    public Long addMonth() {
        Long currentTime = this.currentTime();
        Long passedByMonth = currentTime + 2592000;
        return passedByMonth;
    }

    public String printTime() {
        System.out.println("System start time: " + new Date(this.currentTime()*1000L));
        System.out.println("System time passed by an hour: " + new Date(this.addHour()*1000L));
        System.out.println("System time passed by a day: " + new Date(this.addDay()*1000L));
        System.out.println("System time passed by a week: " + new Date(this.addWeek()*1000L));
        System.out.println("System time passed by a month: " + new Date(this.addMonth()*1000L));
        return null;
    }

}
