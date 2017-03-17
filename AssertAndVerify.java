package testing;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssertAndVerify {

	
		@Test
	public void testMethod() {
			
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.Exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Rothschild_family");
		
		String heading= driver.findElement(By.id("firstHeading")).getText();
		// assert will stop the execution if it fails.
		Assert.assertEquals(heading, "Rothschild family");
		driver.close();
		}
	
	
	
	
	
	
}
