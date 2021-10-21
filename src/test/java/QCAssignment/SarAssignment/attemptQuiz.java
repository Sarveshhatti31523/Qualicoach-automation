package QCAssignment.SarAssignment;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageobjects.quizobject;

@Test
public class attemptQuiz {

	firstInitialization fn=new firstInitialization();
	
	public void Quiz() throws IOException {
		try {
		WebDriver driver=fn.init();
		UserLogin us=new UserLogin(driver);
		us.userlogin();
		driver.manage().window().maximize();

		quizobject qo=new quizobject(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Actions a = new Actions(driver);
		WebElement move =qo.hover();
		a.moveToElement(move).click().build().perform();
		qo.modulequiz().click();
		qo.attemptquiz().click();
		qo.startquiz().click();
		
	}catch(Exception e){System.out.println("No quiz is available");}  
}
}

//ISTQB-ISEB
//SQL