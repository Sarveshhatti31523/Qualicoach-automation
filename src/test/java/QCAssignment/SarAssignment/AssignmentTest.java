package QCAssignment.SarAssignment;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssignmentTest {

	public WebDriver driver;

	@Test
	public void Driver_Init() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.get("https://www.google.co.in/");

	}

	// @Test
	public void Testcase1() {
		driver.get("https://test.qualicoach.org/ ");
		driver.findElement(By.id("username")).sendKeys("user94");
		driver.findElement(By.id("password")).sendKeys("User@7014");
		driver.findElement(By.id("loginbtn")).click();

		// JavascriptExecutor js = (JavascriptExecutor) driver;
	}

	// @Test
	public void Testcase2() throws InterruptedException {

		driver.get("https://test.qualicoach.org/ ");
		driver.findElement(By.id("username")).sendKeys("user94");
		driver.findElement(By.id("password")).sendKeys("User@7014");
		driver.findElement(By.id("loginbtn")).click();
		// after login attempting quiz
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//div[@cat-id='3'] /a /p[text()='API Automation using REST Assured (Beginners)']"));
		a.moveToElement(move).click().build().perform();
	//	if ((boolean) driver.findElement(By.xpath("//*[@value='Enrol me']")).isDisplayed()) {
			driver.findElement(By.xpath("//*[@value='Enrol me']")).click();
		

		driver.findElement(By.id("next-activity-link")).click();
		driver.findElement(By.xpath("//*[@value='Attempt quiz now']")).click();
		driver.findElement(By.xpath("//*[@value='Start attempt']")).click();

		driver.close();
	}

	// @Test
	public void testcase3() {
		// driver.get("https://test.qualicoach.org/ ");
		// driver.findElement(By.id("username")).sendKeys("user94");
		// driver.findElement(By.id("password")).sendKeys("User@7014");
		// driver.findElement(By.id("loginbtn")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//div[@cat-id='3'] /a /p[text()='Python Beginners']"));
		a.moveToElement(move).click().build().perform();
		// click on badge and course feedback
		driver.findElement(By.xpath("//div[@class='content'] / div[@id='accordion'] / div[6]")).click();
		WebElement z = (WebElement) driver.findElement(By.xpath("//div[@class='content'] / div[@id='accordion'] / div[6] / div[1] / div / ul / li / a "));
		// driver.findElement(By.xpath("//div[@id='region-main-box'] /
		// div[@class='row-fluid'] / section / div / div[1] / div[0] / a")).click();
		a.moveToElement(z).click().build().perform();
		driver.findElement(By.linkText("Answer the questions")).click();

		driver.close();
	}

	@Test
	public void testcase4() throws InterruptedException {

		driver.get("https://test.qualicoach.org/ ");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("user88");
		driver.findElement(By.id("password")).sendKeys("User@9146");
		driver.findElement(By.id("loginbtn")).click();
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//div[@cat-id='3'] /a /p[text()='ISTQB-ISEB']"));
		a.moveToElement(move).click().build().perform();
		// driver.findElement(By.xpath("//div[@class='content'] / div[@id='accordion'] /
		// div[8] ")).click();
		
		WebElement x = (WebElement) driver.findElement(By.xpath("//div[@class='content'] / div[@id='accordion'] / div[8] "));
		a.moveToElement(x).click().build().perform();
		WebElement d = (WebElement) driver.findElement(By.xpath("//div[@class='content'] / div[@id='accordion'] / div[8] / div[2] / div / ul / li / a "));
		a.moveToElement(d).click().build().perform();
		Thread.sleep(3000);
		 WebElement y= (WebElement)driver.findElement(By.xpath("//div[@role='main'] /div / div / form / div / input[@type='submit']"));
		 a.moveToElement(y).click().build().perform();
	}

}
