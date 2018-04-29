package com.votesapp;

public class main {

	public static void main(String[] args) throws Exception {

		Window window = new Window();
		window.prepareAndShow();

        long numericTime = (long) 1525132800;
		Timestamp ts = new Timestamp();
		ts.writeTime(numericTime);

	}
}
