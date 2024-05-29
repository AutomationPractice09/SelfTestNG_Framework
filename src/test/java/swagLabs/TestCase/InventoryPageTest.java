package swagLabs.TestCase;

import org.testng.annotations.Test;

public class InventoryPageTest extends BaseClass
{
  @Test (priority = 1)
  public void verifyTitle() 
  {
	 String title = ip.pageTitle();
	 
	 if(title.contains("Labs"))
	 {
		 System.out.println("Page title is as expected");
	 }
  }
  
  @Test (priority = 2)
  public void verifyProductCount() 
  {
	int productCount = ip.getTotalCount();
	System.out.println("Total count of products is: "+productCount);
  }
  
  @Test (priority = 3)
  public void printAllProduct() 
  {
	 ip.productNames();
  }
  
  @Test (priority = 4)
  public void addTocart() 
  {
	 ip.addCart("Sauce Labs Backpack");
  }
   
}
