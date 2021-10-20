package adminpageobjs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class create_courseObjs {

public WebDriver driver;
	
	public create_courseObjs(WebDriver driver) {
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
	
	public WebElement coursesClick() {
		return driver.findElement(By.xpath("//ul[@class='nav nav-tabs'] /li[3]"));
	}
	
	public WebElement Managecourses() {
		return driver.findElement(By.xpath("//div[@class='span9'] /ul[@class='unstyled'] /li /a"));
		
	}
	
	public WebElement createcourses() {
		return driver.findElement(By.xpath("//div[@class='listing-actions course-listing-actions'] /a"));
	}
	
	
}
