package swagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	
	//based on encapsulation i.e, private date + public method
	//use By locator technique
	
	private WebDriver driver;                        //this is not initialized yet
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//private data
	private By username = By.id("user-name");
	private By password = By.id("password"); 
    private By button = By.id("login-button");
    
    
    
    
    //action means public methods
    public void doLogin(String un, String psw)
    {
    	driver.findElement(username).sendKeys(un);
    	driver.findElement(password).sendKeys(psw);
    	driver.findElement(button).click();
    }
    
    public void titlePage()
    {
    	System.out.println("Application Title is: "+driver.getCurrentUrl());
    }
    
    public String getTitle()
    {
    	String title = driver.getTitle();
    	return title;
    }

}
