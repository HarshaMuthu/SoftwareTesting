package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D7T1{
  @Test
  public void Google() {
//	  System.setProperty("webdriver.chrome.driver","c://Drivers//chromedriver.exe" );
	  WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle="Guest Registration Form – User Registration";
		Assert.assertEquals(actualtitle,expectedtitle);

  }
}