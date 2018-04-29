package com.votesapp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StoreInfo {

	public void writer(String filename, String votename, String chosen) throws IOException {
		Writer wr = new FileWriter(filename, true);
		wr.write(votename + "/" + chosen + "/");
		wr.close();
	}

	public void writerForName(String filename, String voterName) throws IOException {
		Writer wr = new FileWriter(filename, true);
		wr.write(voterName + "/");
		wr.write(System.getProperty("line.separator"));
		wr.close();
		
	}
	
	
}
//Storint vote'am, kiekiui isaugot kiek bendrai turejo tam tikra apklausa bals�. Kad nenusiresetint� i�jungus program�