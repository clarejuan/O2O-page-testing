package testcase.main;

import org.testng.annotations.*;

import com.versionone.config.ConfigFiles;
import com.versionone.config.Configuration;
import Configuration.SeleniumTest;


public class Order  extends SeleniumTest{

	
	@BeforeMethod
	public void setup() {
		
		//Start ff browser and open google page(ff and url are set as default)
		start();
		Configuration.setProperties("Order");
	}
	
	
	@Test
	public void OrderTest() {
		
		open(ConfigFiles.PAGE_LOGIN);
		//verifyTitle("baidu.title");
		//verifyCopy("baidu.news");
		click("login.link");
		verifyCopy("login.title");
		enter("login.email","clare.j.li@accenture.com");
		enter("login.password","123456");
		click("login.btn");
		verifyCopy("login.result");
		click("product.item");
		assertEquals(getTextByKey("product.name"),"Photosmart E317 Digital Camera");
		click("buy.btn");
		assertEquals(getTextByKey("delivery.address"),"Delivery Address");
		assertEquals(getTextByKey("product.item.name"),"Photosmart E317 Digital Camera");
		click("place.order.btn");
		assertEquals(getTextByKey("order.submit.success"),"Congratulations,Order Submit Successful");
		//下面两种方法都可以用来验证页面上显示的和实际期望值正确与否
		//verifyCopy("baidu.search.result");   //期望值放到content.properties
		//assertEquals有两个参数，实际值（需要通过Xpath从页面中获取）和期望值
		//assertEquals(getTextByKey("baidu.search.result"),"搜索工具\n百度为您找到相关结果约2,280,000个");		
	}

	@AfterMethod  
	public void end() {
		
		quit();
		
	}

}
