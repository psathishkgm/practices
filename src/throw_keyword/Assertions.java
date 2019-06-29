package throw_keyword;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	SoftAssert softassert = new SoftAssert();
  @Test
  public void login() {
	  System.out.println("Login");
	  Assert.assertEquals(true, true);
	  System.out.println("Username");
	  System.out.println("Password");
	  Assert.assertEquals(true, true);
	  System.out.println("Credit function");
	  softassert.assertEquals(true, false);
	  System.out.println("Deposit function");
	  softassert.assertEquals(true, false);
	  System.out.println("Loan function");
	  softassert.assertEquals(true, false);
	  softassert.assertAll();
	  
	  
  }
}
