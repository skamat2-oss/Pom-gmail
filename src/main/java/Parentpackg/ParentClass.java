package Parentpackg;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class ParentClass{
	public static WebDriver driver;
	public static Properties prop;
	public static Actions action;
	//action = new Actions(driver);
	public ParentClass() throws IOException {
	 prop = new Properties();
	 FileInputStream ip = new FileInputStream("C:\\Users\\Sanil Umakant Kamat\\eclipse-workspace\\PomMod\\src\\main\\java\\com\\qa\\propertiesfile\\configure.properties");
	 prop.load(ip);}
	

public static void init(){
	String BrowserName = prop.getProperty("Browser");
	if(BrowserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sanil Umakant Kamat\\eclipse-workspace\\sanilselenium\\lib\\Chromedriver\\chromedriver.exe");	
		driver = new ChromeDriver();	
	}
	else {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Sanil Umakant Kamat\\eclipse-workspace\\sanilselenium\\lib\\gecko\\geckodriver.exe");
    driver = new FirefoxDriver();  //launch browser
	}

   driver.manage().window().maximize();
  // driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout,TimeUnit.SECONDS);
   //driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait,TimeUnit.SECONDS);
    driver.get(prop.getProperty("urlwa"));
    action = new Actions(driver);
}}
