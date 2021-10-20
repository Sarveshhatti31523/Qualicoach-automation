package pageobjects;

import org.openqa.selenium.By;
import QCAssignment.SarAssignment.firstInitialization;

public class admloginobject  extends firstInitialization{

	
	
	public void adminlogin() {
		driver.get("https://test.qualicoach.org/ ");
		driver.findElement(By.id("username")).sendKeys("admin73");
		driver.findElement(By.id("password")).sendKeys("Admin@6100");
		driver.findElement(By.id("loginbtn")).click();
	}
}



