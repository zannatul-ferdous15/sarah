package softwareTest.PageAction;

import org.testng.Assert;

import softwareTest.PageLocator.HompageLocator;
import softwareTestUtility.Base_softwareTest;

public class HompageAction extends Base_softwareTest{
	
	HompageLocator hompageLocator= new HompageLocator();
	
	public void home_contact_aboutus_login_signup_cart_all_link() {
		boolean homelinkVerify=hompageLocator.HomeLink.isDisplayed();
		Assert.assertTrue(homelinkVerify);
		
		boolean contactlinkVerify=hompageLocator.ContactLink.isDisplayed();
		Assert.assertTrue(contactlinkVerify);
		
		boolean aboutlinkVrify=hompageLocator.AboutLink.isDisplayed();
		Assert.assertTrue(aboutlinkVrify);
		
		boolean loginVerify=hompageLocator.LoginLink.isDisplayed();
		Assert.assertTrue(loginVerify);
		
		boolean signupVerify=hompageLocator.SignupLink.isDisplayed();
		Assert.assertTrue(signupVerify);
		
		boolean cartVerify=hompageLocator.CartLink.isDisplayed();
		Assert.assertTrue(cartVerify);
		
		}
	
	public void home_link_clikable() {
		hompageLocator.HomeLink.click();
		
	}
	public void contact_link_clikable() {
		hompageLocator.ContactLink.click();
		
	}
	public void about_us_link_clikable() {
		hompageLocator.AboutLink.click();
		
	}
	

}

















