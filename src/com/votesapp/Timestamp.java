package com.votesapp;

import java.util.Date;

public class Timestamp {

    public Long currentTime() {
        long numericTime = (long) 1525132800;
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
    
    public Long shiftTime(int param) {
    	
    	Long shiftedTime = this.currentTime();
    	
    	switch(param) {
    		case(1):
    			shiftedTime = this.addHour();
    			break;
    		case(2):
    			shiftedTime = this.addDay();
    			break;
    		case(3):
    			shiftedTime = this.addWeek();
    			break;
    		case(4):
    			shiftedTime = this.addMonth();
    			break;
    		
    		default:
    			break;
    			
    	}
    	
		return shiftedTime;
    	
    }
    
    public Date showDate(int par) {
    	
    	if(par < 0 && par > 4) {
    		par = 0;
    	}
    	
    	Date newDate = new Date(this.shiftTime(par)*1000L);
    	return newDate;
    }

}
