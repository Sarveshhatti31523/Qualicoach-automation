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
import adminpageobjs.create_courseObjs;

public class createCourTest {

	firstInitialization fn=new firstInitialization();
	
	@Test
	public void courseCreation() throws IOException {
		WebDriver driver=fn.init();
		UserLogin us=new UserLogin(driver);
		us.adminlogin();
		driver.manage().window().maximize();
		
		create_courseObjs cCou=new create_courseObjs(driver);
		cCou.userButton().click();
		cCou.dashClick().click();
		cCou.adminClick().click();
		cCou.coursesClick().click();
		cCou.Managecourses().click();
		cCou.createcourses().click();
		
		driver.findElement(By.id("id_fullname")).sendKeys("GAMES AND SPORTS");
		driver.findElement(By.id("id_shortname")).sendKeys("basketball");
		
		WebElement drop1=driver.findElement(By.id("id_startdate_day"));
		Select dropdown1 = new Select(drop1);
		dropdown1.selectByValue("14");
		
		WebElement drop2=driver.findElement(By.id("id_startdate_month"));
		Select dropdown2 = new Select(drop2);
		dropdown2.selectByValue("10");
		
		WebElement drop3=driver.findElement(By.id("id_startdate_year"));
		Select dropdown3 = new Select(drop3);
		dropdown3.selectByValue("2021");
		
		driver.findElement(By.cssSelector("input#id_enddate_enabled")).click();
		System.out.println(driver.findElement(By.cssSelector("input#id_enddate_enabled")).isEnabled());
		
		driver.findElement(By.id("id_idnumber")).sendKeys("9919");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.cssSelector("div#id_summary_editoreditable")).click();
		driver.findElement(By.cssSelector("div#id_summary_editoreditable")).sendKeys("GAMES AND SPORTS MAKE MAN FIT");
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.cssSelector("input#id_saveanddisplay")).click();
		//driver.close();
			
	}
}
