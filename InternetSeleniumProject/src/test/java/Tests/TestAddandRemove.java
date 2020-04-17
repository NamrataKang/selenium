package Tests;

import com.pages.ABpage;
import com.pages.AddandRemoveElementspage;
import com.pages.homePage;

import testbase.base;

public class TestAddandRemove extends base {

	
	
	
	public void gettestdata()
	{
		homePage hp= new homePage(driver);
		AddandRemoveElementspage arp= new AddandRemoveElementspage(driver);	// not accepting driver inside the brackets
		
		arp.clickonAddElement();
		arp.clickOnDeletebutton();
		
	}
	
}
