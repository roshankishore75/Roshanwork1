package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Admintest {
	
	
  public static void main (String[] args)
  {
	
	  System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.Exe");
WebDriver driver = new  ChromeDriver();

	
driver.get("http://gmail.com");

	
	  
	
}
}