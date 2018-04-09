package com.votesapp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StoreInfo {

	public void writer(String filename, String text) throws IOException {
		Writer wr = new FileWriter(filename);
		wr.write(text);
		wr.close();
	}
	
	
}
//Storint vote'am, kiekiui isaugot kiek bendrai turejo tam tikra apklausa bals�. Kad nenusiresetint� i�jungus program�