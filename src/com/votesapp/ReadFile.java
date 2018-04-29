package com.votesapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	String reader(String fileName) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader(fileName));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            line = br.readLine();
	        }
	        return sb.toString();
	    } finally {
	        br.close();
	    }
	}
	
	String readLine(String filename) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(filename));

		String sCurrentLine;
		
		sCurrentLine = br.readLine();
		
		br.close();
		
		return sCurrentLine;

	}
	
}