package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.Firstselenium;

public class PropertiesFile {
	static Properties prop=new Properties();

	public static void main(String[] args)
	{
		readProertiesfile();
		writePropertiesFile();
		
	}
	
	public static void readProertiesfile() {
	
		try {
			InputStream input=new FileInputStream("G:/NILAM/Selenium one/src/config/config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("browser"));
			Firstselenium.browser=prop.getProperty("browser");
			System.out.println(Firstselenium.browser);


		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		public static void writePropertiesFile()
		{
			try {
				OutputStream output= new FileOutputStream("G:/NILAM/Selenium one/src/config/config.properties");
			    prop.setProperty("browser", "firefox");
			    prop.store(output, null);
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	}


