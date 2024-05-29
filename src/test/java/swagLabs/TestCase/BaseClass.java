package swagLabs.TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import swagLabs.Pages.InventoryPage;
import swagLabs.Pages.LoginPage;

public class BaseClass 
{
	public WebDriver driver;               //this is declaration
	public LoginPage lp;                   //we created object of login page
	public InventoryPage ip;               //we created object of inventory page
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();      //this is initialization of chrome driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		lp = new LoginPage(driver);             //this is initialization for login page
		ip = new InventoryPage(driver);         //this is initialization of inventory page
	}
	
	@AfterTest (enabled = false)
	public void tearDown()
	{
		driver.quit();
	}

	@BeforeClass
	public void setupPage()
	{
		lp.doLogin("standard_user","secret_sauce");
	}
}
