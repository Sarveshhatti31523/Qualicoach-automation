package QCAssignment.SarAssignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.studentProfObj;

@Test
public class stu_profileTest {

	firstInitialization fn=new firstInitialization();
	
	public void studentProfile() throws IOException {
		WebDriver driver=fn.init();
		UserLogin us=new UserLogin(driver);
		us.userlogin();
		driver.manage().window().maximize();
		
		studentProfObj sp=new studentProfObj(driver);
		sp.userclick().click();
		sp.profileclick().click();
		sp.editProfclick().click();
		sp.erasename().clear();
		sp.addname().sendKeys("Sarvesh");
		sp.updateclick().click();
		
	}
}
