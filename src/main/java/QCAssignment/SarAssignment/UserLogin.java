package QCAssignment.SarAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class UserLogin extends firstInitialization{

	public UserLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}


	public void userlogin() {
		driver.get("https://test.qualicoach.org/ ");
		driver.findElement(By.id("username")).sendKeys("user94");
		driver.findElement(By.id("password")).sendKeys("User@7014");
		driver.findElement(By.id("loginbtn")).click();
	}
	
	public void userlogincert() {
		driver.get("https://test.qualicoach.org/ ");
		driver.findElement(By.id("username")).sendKeys("user88");
		driver.findElement(By.id("password")).sendKeys("User@9146");
		driver.findElement(By.id("loginbtn")).click();
	}
	
	public void adminlogin() {
		driver.get("https://test.qualicoach.org/ ");
		driver.findElement(By.id("username")).sendKeys("admin73");
		driver.findElement(By.id("password")).sendKeys("Admin@6100");
		driver.findElement(By.id("loginbtn")).click();
	}
	
}
