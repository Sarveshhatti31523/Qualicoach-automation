package QCAssignment.SarAssignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.admloginobject;


public class admin_loginTest{

	public WebDriver driver;
	

	
	@Test
	public void adminLogin() throws IOException {
		firstInitialization a=new firstInitialization();
		driver=a.init();
		
		UserLogin us=new UserLogin(driver);
		us.adminlogin();
		driver.manage().window().maximize();

	}
}
