package jenkins.maven.testng.jenkinstestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void fTest() 
  {
	  System.setProperty("webdriver.gecko.driver","E:\\Eclipse & Gecko\\Gecko Driver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
  }
}
