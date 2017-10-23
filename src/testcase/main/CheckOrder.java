package testcase.main;

import org.testng.annotations.*;

import com.versionone.config.ConfigFiles;
import com.versionone.config.Configuration;
import Configuration.SeleniumTest;


public class CheckOrder  extends SeleniumTest{

	
	@BeforeMethod
	public void setup() {
		
		//Start ff browser and open google page(ff and url are set as default)
		start();
		Configuration.setProperties("CheckOrder");
	}
	
	
	@Test
	public void CheckOrderTest() {
		
		open(ConfigFiles.PAGE_LOGIN);
		//verifyTitle("baidu.title");
		//verifyCopy("baidu.news");
		click("login.link");
		verifyCopy("login.title");
		enter("login.email","clare.j.li@accenture.com");
		enter("login.password","123456");
		click("login.btn");
		verifyCopy("login.result");
		click("chinese.link");
		click("your.account.link");
		assertEquals(getTextByKey("your.account.page"),Configuration.getCopy("your.account.page"));
		click("vieworderhistory.link");
		assertEquals(getTextByKey("orderhistory.title"),Configuration.getCopy("orderhistory.title"));
		click("view.link");
		assertEquals(getTextByKey("orderdetail.text"),Configuration.getCopy("orderdetail.text"));
	}

	@AfterMethod  
	public void end() {
		
		quit();
		
	}

}
