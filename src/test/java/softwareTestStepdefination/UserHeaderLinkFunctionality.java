package softwareTestStepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import softwareTest.PageAction.HompageAction;
import softwareTestUtility.Base_softwareTest;

public class UserHeaderLinkFunctionality extends Base_softwareTest {
	
	HompageAction hompageAction= new HompageAction();
	
	@Given("^open SoftwareTest \"([^\"]*)\" application$")
	public void open_SoftwareTest_application(String URL) throws Throwable {
		softwareTest_URL_Setup(URL);
	    
	}

	@When("^verify home, contact, about us, log in, sign up, cart all link are on the home page$")
	public void verify_home_contact_about_us_log_in_sign_up_cart_all_link_are_on_the_home_page() throws Throwable {
		hompageAction.home_contact_aboutus_login_signup_cart_all_link();
	}
	@Then("^verify home link is clikable$")
	public void verify_home_link_is_clikable() throws Throwable {
		hompageAction.home_link_clikable();
	}

	@Given("^verify contact link is clikable$")
	public void verify_contact_link_is_clikable() throws Throwable {
		hompageAction.contact_link_clikable();
	}

	@Given("^verify about us link is clikable$")
	public void verify_about_us_link_is_clikable() throws Throwable {
		hompageAction.about_us_link_clikable();
	}


}
