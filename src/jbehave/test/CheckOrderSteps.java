package jbehave.test;
import org.jbehave.core.annotations.*;
import com.versionone.config.Configuration;
import Configuration.SeleniumTest;
import com.versionone.config.ConfigFiles;
import org.jbehave.core.annotations.*;
public class CheckOrderSteps extends SeleniumTest{
	
	
	@Given("open O2O page")
	public void givenOpenO2OPage(){
		start();
		Configuration.setProperties("CheckOrderSteps");
	}
	
	@When("I click login link")
	public void whenIClickLoginLink(){
		click("login.link");
	}
	
	
	@Then("login page show $content")
	public void thenLoginPageShowContent(String content){
		verifyCopy("login.title");
	}
	
	@When("I enter user email")
	public void whenIEnterUserEmail(){
		enter("login.email","clare.j.li@accenture.com");
	}
	
	@When(" I enter password")
	public void whenIEnterPassword(){
		enter("login.password","123456");
	}
	
	@When("click login button")
	public void whenClickLoginButton(){
		click("login.btn");
	}

	@Then("login success and show $content")
	public void thenLoginSuccessAndShowContent(String content){
		verifyCopy("login.result");
	}
	
	@When("click chinese")
	public void whenClickChinese(){
		click("chinese.link");
	}
	
	
	@When("click Your account")
	public void whenClickYourAccount(){
		click("your.account.link");
	}
	
	@Then("Your account page show $content")
	public void thenYourAccountPageShowContent(String content){
		assertEquals(getTextByKey("your.account.page"),Configuration.getCopy("your.account.page"));
	}
	
	@Then("click view order history")
	public void thenClickViewOrderHistory(){
		click("vieworderhistory.link");
	}
		
	
	@Then("Order histroy page show $content")
	public void thenOrderHistroyPageShowContent(String content){
		assertEquals(getTextByKey("orderhistory.title"),Configuration.getCopy("orderhistory.title"));
	}
	
	@When("click view link")
	public void whenClickViewLink(){
		click("view.link");
	}

	@Then("order detail page show $content")
	public void thenOrderDetailPageShowContent(String content){
		assertEquals(getTextByKey("orderdetail.text"),Configuration.getCopy("orderdetail.text"));
	}
	
	@Then("I quit browser")
	public void thenIQuitBrowser(){
		 quit();
	}
	
}