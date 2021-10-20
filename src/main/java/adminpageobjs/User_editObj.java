package adminpageobjs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class User_editObj {

public WebDriver driver;
	
	public User_editObj(WebDriver driver) {
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
	
	public WebElement browseUser() {
		return driver.findElement(By.xpath("//div[@class='row'] /div[@class='span9'] /ul[@class='unstyled indented-list'] /li[1] /a[text()='Browse list of users']"));
	}
	
	public WebElement textEnter() {
		return driver.findElement(By.cssSelector("input[id='id_realname']"));
		
	}
	
	public WebElement filterclick() {
		return driver.findElement(By.cssSelector("input[id='id_addfilter']"));
		
	}
	
	public WebElement rowclick() {
		return driver.findElement(By.xpath("//*[@class='lastrow'] /td[6] /a[3]"));
		
	}
	
	public WebElement updateclick() {
		return driver.findElement(By.cssSelector("input[value='Update profile']"));
	}
}
