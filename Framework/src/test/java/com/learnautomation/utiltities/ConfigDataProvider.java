package com.learnautomation.utiltities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;

	public ConfigDataProvider()
	{
		File src = new File("./Configuration/Config.properties");
		
		try {
			
			FileInputStream fis = new FileInputStream(src);
			
			pro = new Properties();
			
			pro.load(fis);
		}
		catch (IOException e) {
			
			System.out.println("Not able to load config file"+e.getMessage());
			
		}
	}
	
	public String getDataFromConfig(String keytoSearch)
	{
		return pro.getProperty(keytoSearch);
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getStagingURL()
	{
		return pro.getProperty("qaURL");
	
	}
	
	
}