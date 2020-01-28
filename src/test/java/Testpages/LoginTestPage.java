package Testpages;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageLayer.HomePageClass;
import PageLayer.LoginPageClass;
import Parentpackg.ParentClass;

public class LoginTestPage extends ParentClass {
	public ParentClass prnt;
    LoginPageClass loginpge;
    HomePageClass homepge;
    
    public LoginTestPage() throws IOException {
   	 //prnt = new ParentClass();
   	 //prnt.there();
    	super();
    }
	@BeforeMethod
	public void setUp() throws IOException {
		//prnt = new ParentClass();
		//Properties prop = new Properties();
		init();
		loginpge = new LoginPageClass();	
	}
    @Test
    public void LoginTest() {
    	homepge = loginpge.LoginCredentials(prop.getProperty("username"),prop.getProperty("password"));
    }
    
    @AfterMethod
    public  void tearDown() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.quit();
    }
}
