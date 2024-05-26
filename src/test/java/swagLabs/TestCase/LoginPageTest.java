package swagLabs.TestCase;

import org.testng.annotations.Test;


public class LoginPageTest extends BaseClass
{
  @Test (priority = 1)
  public void loginTest() 
  {
	  lp.doLogin("standard_user", "secret_sauce");
  }
  
  @Test (priority = 2)
  public void verifyUrl() 
  {
	  lp.titlePage();
  }
  
  @Test (priority = 3)
  public void verifyTitle()
  {
	  String actual = lp.getTitle();
	  
	  if (actual.contains("Labs"))
	  {
		  System.out.println("Title Verified");
	  }
	  else
	  {
		  System.out.println("Title verification is failed");
	  }
  }
}
