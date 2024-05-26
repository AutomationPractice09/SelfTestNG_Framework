package swagLabs.TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import swagLabs.Pages.LoginPage;

public class BaseClass 
{
	public WebDriver driver;               //this is declaration
	public LoginPage lp;                   //we created object of login page
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();      //this is initialization of chrome driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		lp = new LoginPage(driver);             //this is initialization for login page
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
