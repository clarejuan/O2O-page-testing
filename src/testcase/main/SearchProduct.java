package testcase.main;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import com.versionone.config.ConfigFiles;
import com.versionone.config.Configuration;
import Configuration.SeleniumTest;


public class SearchProduct  extends SeleniumTest{

	
	@BeforeMethod
	public void setup() {
		
		//Start ff browser and open google page(ff and url are set as default)
		start();
		Configuration.setProperties("SearchProduct");
	}
	
	
	@Test
	public void SearchProductTest() {
		
		open(ConfigFiles.PAGE_LOGIN);
		//verifyTitle("baidu.title");
		//verifyCopy("baidu.news");
		//click("search.frame");
		enter("search.frame","NV10");
		click("search.btn");
		assertEquals(getTextByKey("search.product"),"NV10");
	}

	@AfterMethod  
	public void end() {
		
		quit();
		
	}

}
