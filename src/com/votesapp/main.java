package com.votesapp;

public class main {

	public static void main(String[] args) throws Exception {

		Window window = new Window();
		window.prepareAndShow();
		
		QuestionWindow question = new QuestionWindow();
		question.prepareAndShow();
        
        StoreInfo storeInfo = new StoreInfo();
        storeInfo.writer("pavadinimas.txt","Informacija irasoma i faila");

	}
}
