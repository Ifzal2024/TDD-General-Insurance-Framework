package general_utils;

import java.io.IOException;
import java.util.Properties;

import general_constants.KeyConfig;

public class ReadConfig {
	
	 Properties properties;
	 
		//Creating Constructor
		 public ReadConfig() {
			 //add loadProperties method here. So when constructor gets initailized, method will be called.
			 loadProperties();
			 
			 
		 }
		
		
		//We will use Try Catch instead of throws.// private void loadProperties() throws IOException {
		 private void loadProperties()  {
			properties=new Properties();
			try {
				properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
			
			//in the catch I am going to say IOException
			} catch (IOException  e) {
				
				//Add e.printstackTrace. What is e?= Reference to Exception--> IOException Class
				// PrintStack= coming from Reference IOException
				//It will show you where the mistake happened.It will give you trace of your exception
				e.printStackTrace();
			}
		
			//Example below
			//ReadConfig config= new ReadConfig();<--- will call default constructor, no argument constructor.
			// Once we call default constructor, it will call the load method, will load class from main, 
			//get resource from configuiration.properties
			
		}
		 

		 public String getValue(KeyConfig key) {
			 return properties.getProperty(key.toString());
			 
		 }
	
	

}
