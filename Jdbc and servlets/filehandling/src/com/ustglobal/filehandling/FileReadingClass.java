package com.ustglobal.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingClass {
	public static void main(String[] args) {

		FileReader reader = null;
		String path = "C:\\Users\\admin\\Desktop\\desktop.txt";
		try {
			reader = new FileReader(path);
//			int i = reader.read();
//			char ch = (char)i;
			int i;
			while((i=reader.read())!=-1) {
			System.out.print((char)i);
			}

		}catch(IOException e) {
			e.printStackTrace();
		}


	}//end of main

}//end of class
