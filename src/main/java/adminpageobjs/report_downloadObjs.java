package adminpageobjs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class report_downloadObjs {

public WebDriver driver;
	
	public report_downloadObjs(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
public WebElement userButton() {
		
		return driver.findElement(By.className("userbutton"));
	}
	
	public WebElement dashClick() {
		 return driver.findElement(By.id("actionmenuaction-1"));
		
		
	}
	
	
}
