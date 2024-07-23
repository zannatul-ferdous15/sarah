package softwareTestUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base_softwareTest {
	public static WebDriver driver;
	public static Properties softwareTestprop;
	
	
	public Base_softwareTest() {
		try {
			FileInputStream softwaretestFile= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\softwareTest\\Configure\\SoftwareTestConfig.properties");
			 softwareTestprop= new Properties();
			 softwareTestprop.load(softwaretestFile);
		} catch (FileNotFoundException e) {
			System.out.println("please fixed our constructor");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
	public void softwareTest_Browser_Setup() {
		String softwareTestAllBrowser= softwareTestprop.getProperty("Browser");
		if(softwareTestAllBrowser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\softwareTestDriver\\chromedriver.exe");//set chromedriver	
			 ChromeOptions  obj=new ChromeOptions();
			 obj.addArguments("--remote-allow-origins=*");
			  driver=new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utility_softwareTest.implicitlyWait));
			  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utility_softwareTest.pageLoadTimeout));
			  driver.manage().window().maximize();
			  driver.manage().deleteAllCookies();
			
		}
		
		else if(softwareTestAllBrowser.equals("IE")) {
			}
	}
	public void softwareTest_URL_Setup(String URL) {
		driver.get(softwareTestprop.getProperty("SoftwareTestURL"));
	}
	

}
