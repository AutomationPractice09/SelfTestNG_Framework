package swagLabs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {

	private WebDriver driver;
	
	//initialize the driver
	public InventoryPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//locators
	private By count = By.xpath("//div[@class='inventory_item']");
	private By pname = By.xpath("//div[@class='inventory_list']//div[@class='inventory_item']//a//div[@class='inventory_item_name ']");
	private By addCart = By.xpath("//button[text()='Add to cart']");
	
	
	
	//actions
	public int getTotalCount()
	{
		int productCount = driver.findElements(count).size();
		return productCount;
	}
	
	
	public void productNames()
	{
		List<WebElement> list = driver.findElements(pname);
		
		for(WebElement i : list)
		{
			System.out.println(i.getText());
		}
	}
	
	
	public void addCart(String product)
	{
		List<WebElement> list = driver.findElements(pname);
		
		for(WebElement i : list)
		{
			if(i.getText().contains(product))
			{
				i.click();
				break;
				
			}
			driver.findElement(addCart).click();
		}
	}
	
	
	public String pageTitle()
	{
		String title = driver.getTitle();
		return title;
	}
			
}
