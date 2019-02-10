package com.test.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id="txtusername")
	WebElement username;
	
	@FindBy(id="txtpassword")
	WebElement password;
	
	@FindBy(id="submit")
	WebElement submitBtn;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterCredtenial(){
		username.clear();
		username.sendKeys("admin");
		password.sendKeys("admin");
		submitBtn.click();
	}

}
