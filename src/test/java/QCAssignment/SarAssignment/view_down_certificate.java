package QCAssignment.SarAssignment;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageobjects.certificateobject;

@Test
public class view_down_certificate {

	firstInitialization fn=new firstInitialization();
	
	public void cert() throws IOException {
		WebDriver driver=fn.init();
		UserLogin us=new UserLogin(driver);
		us.userlogincert();
		driver.manage().window().maximize();
		
		certificateobject co=new certificateobject(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Actions a = new Actions(driver);
		WebElement move =co.hover();
		a.moveToElement(move).click().build().perform();
		co.certi_option().click();
		co.certi_option1().click();
		co.download_certi().click();
	}
}
