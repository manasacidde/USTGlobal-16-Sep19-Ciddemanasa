package com.ustglobal.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {
	public static void main(String[] args) {
		String path = "db.properties";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			Properties properties = new Properties();
			properties.load(reader);
			String url=properties.getProperty("url");
			String username=properties.getProperty("username");
			String password=properties.getProperty("password");
			System.out.println("url "+url);
			System.out.println("username "+username);
			System.out.println("password "+password);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}


