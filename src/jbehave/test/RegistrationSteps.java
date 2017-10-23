package jbehave.test;
import org.jbehave.core.annotations.*;
import org.openqa.selenium.By;

import com.versionone.config.Configuration;
import Configuration.SeleniumTest;

import org.jbehave.core.annotations.*;
public class RegistrationSteps extends SeleniumTest{
	
	
	@Given("open O2O page")
	public void givenOpenO2OPage(){
		start();
		Configuration.setProperties("RegistrationSteps");
	}
	
	@When("I click registration link")
	public void whenIClickLoginLink(){
		click("registration.link");
	}
	
	
	@Then("Registration page show $content")
	public void thenRegistrationPageShowContent(String content){
		assertEquals(getTextByKey("registration.title"),"I'M A NEW CUSTOMER");
	}
	
	@When("Select Title")
	public void whenSelectTitle(){
		select(By.xpath(".//*[@id='register.title']"),"mr");
	}
	
	@Then("Input First name")
	public void thenInputFirstName(){
		enter("input.firstname","accenture");
	}
	
	@Then("Input Surname")
	public void thenInputSurName(){
		enter("input.surname","shanghai");
	}
	
	@Then("Input Email")
	public void thenInputEmail(){
		enter("input.email","test11@acc.com");
	}
	
	@Then("Input mobile number")
	public void thenInputMobileNumber(){
		enter("input.mobile","15862547896");
	}
	
	@Then("Input PSW")
	public void thenInputPsw(){
		enter("input.psw","123456");
	}
	
	@Then("Input Confirmed PSW")
	public void thenInputConfirmedPsw(){
		enter("input.confirmpsw","123456");
	}

	
	@When("Click Register btn")
	public void WhenClickRegisterBtn(){
		click("regitser.btn");
	}

	@Then("Registration success and show $content")
	public void ThenRegistrationSuccessAndShow(String content){
		assertEquals(getTextByKey("register.succss"),"Thank you for registering.");
	}
	
	
	@Then("I quit browser")
	public void thenIQuitBrowser(){
		 quit();
	}
}