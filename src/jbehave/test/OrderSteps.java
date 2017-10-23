package jbehave.test;
import org.jbehave.core.annotations.*;
import com.versionone.config.Configuration;
import Configuration.SeleniumTest;

import org.jbehave.core.annotations.*;
public class OrderSteps extends SeleniumTest{
	
	
	@Given("open O2O page")
	public void givenOpenO2OPage(){
		start();
		Configuration.setProperties("OrderSteps");
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
	
	@When("I select a product")
	public void WhenISelectAProduct(){
		click("product.item");
	}

	@Then("The product detail page is show $content")
	public void ThenTheProductDetailPageIsShow(String content){
		assertEquals(getTextByKey("product.name"),"Photosmart E317 Digital Camera");
	}
	
	@Then("Click Buy Now button")
	public void ThenClickBuyNowButton(){
		click("buy.btn");
	}
	
	@Then("Delivery addres show $content")
	public void ThenDelivreyAddressShow(String content){
		assertEquals(getTextByKey("delivery.address"),"Delivery Address");
	}
	
	
	@Then("Product item show $content")
	public void ThenProductItemShow(String content){
		assertEquals(getTextByKey("product.item.name"),"Photosmart E317 Digital Camera");
	}
	
	@Then("Click Place Order button")
	public void ThenClickPlaceOrderButton(){
		click("place.order.btn");
	}
	
	@Then("Order submit success show $content")
	public void ThenOrderSubmitSuccessShow(String content){
		assertEquals(getTextByKey("order.submit.success"),"Congratulations,Order Submit Successful");
	}
	
	@Then("I quit browser")
	public void thenIQuitBrowser(){
		 quit();
	}
}