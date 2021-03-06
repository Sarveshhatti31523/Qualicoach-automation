package QCAssignment.SarAssignment;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageobjects.feedbackobject;

@Test
public class feedbackTest {

	firstInitialization fn=new firstInitialization();
	
	public void feedback() throws IOException {
		WebDriver driver=fn.init();
		UserLogin us=new UserLogin(driver);
		us.userlogin();
		driver.manage().window().maximize();
        
		feedbackobject fo=new feedbackobject(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Actions a = new Actions(driver);
		WebElement move =fo.hover();
		a.moveToElement(move).click().build().perform();
		fo.feed_click1().click();
		//fo.feed_badgeclick().click();
	   	fo.feed_click2().click();
		fo.answer_ques().click();
		
	}
}
