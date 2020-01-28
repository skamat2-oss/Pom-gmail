package PageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Parentpackg.ParentClass;

public class LoginPageClass extends ParentClass {
	@FindBy(xpath = "//input[@id='identifierId']")
	WebElement Emailid;
	
	@FindBy(xpath = "//div[@id='identifierNext']")
	WebElement Nextbtn;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath = "//div[@id='passwordNext']")
	WebElement PasswdNext;
	


public LoginPageClass() throws IOException
{
	PageFactory.initElements(driver,this);
}

public HomePageClass LoginCredentials(String un,String pwd) {
	Emailid.sendKeys(un);
	Nextbtn.click();
	Password.sendKeys(pwd);
	PasswdNext.click();
	return new HomePageClass();
}
}