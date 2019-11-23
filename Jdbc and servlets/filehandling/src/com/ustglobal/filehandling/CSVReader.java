package com.ustglobal.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVReader {
	public static void main(String[] args) {
		
		try(FileReader in = new FileReader("csv.txt");
		BufferedReader reader = new BufferedReader(in)){
			while(reader.ready()) {
			String line =reader.readLine();
			String[] word = line.split(",");
			System.out.println("id: "+word[0]);
			System.out.println("name : "+word[1]);
			System.out.println("sal :"+word[2]);
			System.out.println("gender :"+word[3]);
			System.out.println("************");
			
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
