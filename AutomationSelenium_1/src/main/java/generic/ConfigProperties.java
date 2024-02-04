package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
	
	public static String getValue (String value) {
		
		
		
		File file = new File("./Config.properties");
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Properties ps = new Properties();
		
			try {
				ps.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		ps.getProperty(value);
		System.out.println(ps.getProperty(value));
		
		return value;
		
	}
	
	public static void main(String[] args) {
		
		ConfigProperties.getValue("URL");
		ConfigProperties.getValue("Username");
		ConfigProperties.getValue("Password");

}

}
