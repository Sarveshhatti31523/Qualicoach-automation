package admin_package;

import java.io.IOException;

//import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import QCAssignment.SarAssignment.UserLogin;
import QCAssignment.SarAssignment.firstInitialization;
import adminpageobjs.User_creObjs;

public class User_CreateTest {

	firstInitialization fn=new firstInitialization();
	
	@Test
	public void course_enroll() throws IOException, InterruptedException {
		WebDriver driver=fn.init();
		UserLogin us=new UserLogin(driver);
		us.adminlogin();
		driver.manage().window().maximize();
		
		User_creObjs enCo=new User_creObjs(driver);
		enCo.userButton().click();
		enCo.dashClick().click();
		enCo.adminClick().click();
		enCo.userclick().click();
		enCo.addUser().click();
		enCo.inputName().sendKeys("kagamikise");
		driver.findElement(By.cssSelector("span[data-passwordunmask='displayvalue']")).click();
		enCo.inputPass().sendKeys("Kuroku");
		enCo.inputFirstName().sendKeys("first");
		enCo.inputLastName().sendKeys("last");
		enCo.inputEmail().sendKeys("gdplmdg@gmail.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(4000);
		enCo.submit().click();
		//driver.close();
	}
}
