package com.votesapp;

import java.io.IOException;
import java.util.Date;

public class Timestamp {

    public Long currentTime() {
        long numericTime = (long) 1525132800;
        return numericTime;
    }
    
    public void shiftTime(int param) throws IOException {
    	    	    
    	Long shiftedTime = this.readTime();
    	
    	switch(param) {
    		case(1):
    			shiftedTime += 3600;
    			this.writeTime(shiftedTime);
    			break;
    		case(2):
    			shiftedTime += 86400;
    			this.writeTime(shiftedTime);
    			break;
    		case(3):
    			shiftedTime += 604800;
    			this.writeTime(shiftedTime);
    			break;
    		case(4):
    			shiftedTime += 2592000;
    			this.writeTime(shiftedTime);
    			break;
			default:
				shiftedTime = this.currentTime();
				this.writeTime(shiftedTime);
				break;
    	}
    	
    }
    
    public void writeTime(Long shiftedTime) {
    	String convertedTime = shiftedTime.toString();
    	convertedTime.substring(0,10);
    	StoreInfo storeInfo = new StoreInfo();
        try {
			storeInfo.timeWriter("timestamp.txt", convertedTime);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public Date generateDate() throws IOException {
    	
    	Long newTimestamp = this.readTime();
		Date newDate = new Date(newTimestamp*1000L);
    	return newDate;
    }
    
    public Long readTime() throws IOException {
        ReadFile readFile = new ReadFile();
		String timestamp = readFile.readLine("Timestamp.txt");
		Long newTimestamp = Long.parseLong(timestamp);
		
		return newTimestamp;
    }

}
