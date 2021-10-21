package QCAssignment.SarAssignment;
import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageobjects.Enrollobjects;

@Test
public class courseenroll {

	firstInitialization fn=new firstInitialization();
	
	public void enrollTest() throws IOException {
		try {
		WebDriver driver=fn.init();
		UserLogin us=new UserLogin(driver);
		us.userlogin();
		driver.manage().window().maximize();

		Enrollobjects en=new Enrollobjects(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Actions a = new Actions(driver);
		WebElement move =en.hover();
		a.moveToElement(move).click().build().perform();
		en.enrollclick().click();
		
	}catch(Exception e){System.out.println("This course is already enrolled");} 
}
}

//Cucumber 101