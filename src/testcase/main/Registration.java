package testcase.main;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import com.versionone.config.ConfigFiles;
import com.versionone.config.Configuration;
import Configuration.SeleniumTest;


public class Registration  extends SeleniumTest{

	
	@BeforeMethod
	public void setup() {
		
		//Start ff browser and open google page(ff and url are set as default)
		start();
		Configuration.setProperties("Registration");
	}
	
	
	@Test
	public void RegistrationTest() {
		
		open(ConfigFiles.PAGE_LOGIN);
		click("registration.link");
		assertEquals(getTextByKey("registration.title"),"I'M A NEW CUSTOMER");
		select(By.xpath(".//*[@id='register.title']"),"mr");
		enter("input.firstname","accenture1");
		enter("input.surname","shanghai1");
		enter("input.email","test21@acc.com");
		enter("input.mobile","15862547893");
		enter("input.psw","123456");
		enter("input.confirmpsw","123456");
		click("regitser.btn");
		assertEquals(getTextByKey("register.succss"),"Thank you for registering.");
		
	}

	@AfterMethod  
	public void end() {
		
		quit();
		
	}

}
