package admin_package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import QCAssignment.SarAssignment.UserLogin;
import QCAssignment.SarAssignment.firstInitialization;
import adminpageobjs.User_editObj;

public class admin_userEdit {

	firstInitialization fn=new firstInitialization();
	
	@Test
	public void EditUserTest() throws IOException {
		
		WebDriver driver=fn.init();
		UserLogin us=new UserLogin(driver);
		us.adminlogin();
		driver.manage().window().maximize();
		
		User_editObj ue=new User_editObj(driver);
		ue.userButton().click();
		ue.dashClick().click();
		ue.adminClick().click();
		ue.userclick().click();
		ue.browseUser().click();
		ue.textEnter().sendKeys("Demo User");
		ue.filterclick().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		ue.rowclick().click();
		js.executeScript("window.scrollBy(0,1000)");
		WebElement drop=driver.findElement(By.id("id_country"));
		Select dropdown = new Select(drop);
		dropdown.selectByValue("IN");
		js.executeScript("window.scrollBy(0,1000)");
		ue.updateclick().click();
}
}

