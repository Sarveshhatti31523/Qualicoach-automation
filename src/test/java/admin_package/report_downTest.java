package admin_package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import QCAssignment.SarAssignment.UserLogin;
import QCAssignment.SarAssignment.firstInitialization;
import adminpageobjs.report_downloadObjs;

public class report_downTest {


	firstInitialization fn=new firstInitialization();
	
	@Test
	public void reportsDownload() throws IOException {
		WebDriver driver=fn.init();
		UserLogin us=new UserLogin(driver);
		us.adminlogin();
		driver.manage().window().maximize();
		
		report_downloadObjs RD=new report_downloadObjs(driver);
		RD.userButton().click();
		RD.dashClick().click();
		
		driver.findElement(By.linkText("Names of resources attempting course")).click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//div[@class='centerpara'] /a /img[@alt='csv']")).click();
		//driver.close();
		
	}
}
