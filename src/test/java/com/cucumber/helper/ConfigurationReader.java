package com.cucumber.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties p;
	
	public ConfigurationReader() throws IOException {
		File f = new File("C:\\Users\\GOKUL\\eclipse-workspace\\Goibibo_Project\\"
				+ "src\\test\\java\\com\\cucumber\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public static String browserLaunch() {
		String browser = p.getProperty("browsername");
		return browser;
	}
	
	public static String url() {
		String url = p.getProperty("url");
		return url;
	}
	

}
