package com.votesapp;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public void reader(String filename) throws Exception {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}