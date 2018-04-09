package com.votesapp;

import java.io.Writer;

public class StoreInfo {

	private void writer() {
		Writer wr = new FileWriter("StoreInfo.txt");
		wr.write("Norima patalpinti informacija");
		wr.close();
		
		
	}
	
	
}
//Storint vote'am, kiekiui isaugot kiek bendrai turejo tam tikra apklausa bals�. Kad nenusiresetint� i�jungus program�