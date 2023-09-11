package general_unit_testing;

import org.testng.annotations.Test;

import general_constants.KeyConfig;
import general_utils.ReadConfig;

public class ReadConfigUnitTest {


	// Advantage of @Test over main method?
//With Test you don't need main method . That means @Test Entry point. of Java Test
// @Test we can use or define many @Test but with main method we can only define one main method in class.
// Test is Superior. We can use multiple Test
@Test
public void getPropertiesTest() {
ReadConfig config = new ReadConfig();
	//WIthout creating object I cannot access getvalue method
	//config.getValue("url"); // It will Print anything because in ReadCOnfig Class
	//it has return and no Print method in the String getValue method
	// So to see something, we need to add sysout
	String urlString= config.getValue(KeyConfig.URL); 
	System.out.println(urlString);
}
	
	
}
