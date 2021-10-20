package QCAssignment.SarAssignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class UserLoginTest {


	public WebDriver driver;
	

	@Test
	public void studentLogin() throws IOException {
		firstInitialization fs=new firstInitialization();
		driver=fs.init();
		
		UserLogin us=new UserLogin(driver);
		us.userlogin();
	}
	
}
