package com.votesapp;

import java.io.IOException;

public class VoteCounter {

	public void addVote(String votename, String chosen) throws IOException {
		
        StoreInfo storeInfo = new StoreInfo();
        storeInfo.writer("balsai.txt", votename, chosen);
	}

	public void addVoter(String voterName) throws IOException {
		StoreInfo storeInfo = new StoreInfo();
        storeInfo.writerForName("balsai.txt", voterName);
	}

}