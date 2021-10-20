package adminpageobjs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class User_creObjs {

public WebDriver driver;
	
	public User_creObjs(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
public WebElement userButton() {
		
		return driver.findElement(By.className("userbutton"));
	}
	
	public WebElement dashClick() {
		 return driver.findElement(By.id("actionmenuaction-1"));
		
		
	}
	
	public WebElement adminClick() {
		return driver.findElement(By.className("administration"));
		
	}
	
	public WebElement userclick() {
		return driver.findElement(By.xpath("//a[text()='Users']"));
		
	}
	
	public WebElement addUser() {
	    return driver.findElement(By.xpath("//div[@class='row'] /div[@class='span9'] /ul[@class='unstyled indented-list'] /li[3] /a[text()='Add a new user']"));
    
	}
	
	public WebElement inputName() {
		return driver.findElement(By.cssSelector("input[id='id_username']"));
	}
	
	public WebElement inputPass() {
		return driver.findElement(By.cssSelector("input[id='id_newpassword']"));
	}
	
	public WebElement inputFirstName() {
		return driver.findElement(By.xpath("//input[@id='id_firstname']"));
	}
	
	public WebElement inputLastName() {
		return driver.findElement(By.xpath("//input[@id='id_lastname']"));
	}
	
	public WebElement inputEmail() {
		return driver.findElement(By.cssSelector("input[name='email']"));
	}
	
	public WebElement submit() {
		return driver.findElement(By.xpath("//*[@type='submit']"));
	}
}
