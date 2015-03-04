package org.future.projectManagement.utils;

import java.io.IOException;
import java.util.Properties;

public class FileLocation {
	private static Properties properties;
	static{
		properties = new Properties();
		try {
			properties.load(FileLocation.class.getClassLoader().getResourceAsStream("fileLocation.properties"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public static String readUrl(String key){
		
		return (String) properties.get(key);
	}
}
