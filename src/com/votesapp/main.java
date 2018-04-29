package com.votesapp;

public class main {

	public static void main(String[] args) throws Exception {

		Window window = new Window();
		window.prepareAndShow();

        Timestamp timestamp = new Timestamp();
        timestamp.printTime();
        
        ReadFile readFile = new ReadFile();
        readFile.reader("klausimai.txt");
        
        StoreInfo storeInfo = new StoreInfo();
        storeInfo.writer("pavadinimas.txt","Informacija irasoma i faila");

	}
}
