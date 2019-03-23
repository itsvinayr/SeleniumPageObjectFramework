package com.test.selenium.hybridTestFramework.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class LoadProperties {
	
	public Properties properties = null;
	private FileInputStream fileInputStream = null;
	private File file = null;
	
	public LoadProperties(String propFileName) {
		
		properties = new Properties();
		file = new File(System.getProperty("user.dir") + propFileName);
		try {
			fileInputStream = new FileInputStream(file);
			properties.load(fileInputStream);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
