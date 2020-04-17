package Tests;

import org.testng.annotations.Test;

import com.pages.ABpage;
import com.pages.homePage;

import junit.framework.Assert;
import testbase.base;

public class TestABControl extends base {
    
	@Test
	public void testdata()
	{
		homePage hp = new homePage(driver);
		ABpage ap= new ABpage(driver);
		
		hp.clickonABtesting();
		Assert.assertEquals(ap.getABtext(),"A/B Test Control");
		
		ap.clickonElementalSelenium();
		
		
		 
		
	}
	
	
	
}
