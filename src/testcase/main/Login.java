package testcase.main;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.versionone.config.ConfigFiles;
import com.versionone.config.Configuration;

import Configuration.SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login extends SeleniumTest{
	
	  @BeforeMethod
	  @Parameters("browser")
	  public void BeforeMethod(String value)
	  {		
		  start(value);
		  Configuration.setProperties("Login");
		
	  }
	 
	  @Test(priority = 1)
	  public void testme() {
		  
		  open(ConfigFiles.PAGE_LOGIN);
		  click("login.link");
		  verifyCopy("login.title");
		  enter("login.email","clare.j.li@accenture.com");
		  enter("login.password","123456");
		  click("login.btn");
		  verifyCopy("login.result");
		  
	  }
 
	 
	  @AfterMethod
	  public void AfterMethod()
	  {	
		  quit();
	  }
}
