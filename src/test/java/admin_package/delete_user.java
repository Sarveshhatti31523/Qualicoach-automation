package admin_package;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import QCAssignment.SarAssignment.UserLogin;
import QCAssignment.SarAssignment.firstInitialization;
import adminpageobjs.del_userObjs;

public class delete_user {

firstInitialization fn=new firstInitialization();
	
@Test
	public void user_deletion() throws IOException {
		WebDriver driver=fn.init();
		UserLogin us=new UserLogin(driver);
		us.adminlogin();
		driver.manage().window().maximize();
		
		del_userObjs del=new del_userObjs(driver);
		del.userButton().click();
		del.dashClick().click();
		del.adminClick().click();
		del.userclick().click();
		del.browseUser().click();
		del.textEnter().sendKeys("ajat singh");
		del.filterclick().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		del.rowclick().click();
		del.deleclick().click();
		
		
		
		
		
	}
}
