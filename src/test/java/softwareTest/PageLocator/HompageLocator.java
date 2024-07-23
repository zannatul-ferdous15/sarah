package softwareTest.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import softwareTestUtility.Base_softwareTest;

public class HompageLocator extends Base_softwareTest {
	
	public HompageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[text()='Home ']")
	public WebElement HomeLink;
	
	@FindBy(xpath="//a[text()='Contact']")
	public WebElement ContactLink;

	@FindBy(xpath="//a[text()='About us']")
	public WebElement AboutLink;

	@FindBy(id="cartur")
	public WebElement CartLink;

	@FindBy(id="login2")
	public WebElement LoginLink;

	@FindBy(id="signin2")
	public WebElement SignupLink;


}
