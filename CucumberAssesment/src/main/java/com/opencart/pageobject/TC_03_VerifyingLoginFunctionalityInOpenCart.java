package com.opencart.pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opencart.utilities.Base;

public class TC_03_VerifyingLoginFunctionalityInOpenCart extends Base {
	
	public void myAccount() {
		WebElement account=driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
		account.click();
		WebElement login=driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Login')]"));
		login.click();
				
	}
	
	public void verifyLoginHomePage() {
		String expurl=driver.getCurrentUrl();
		Assert.assertEquals("https://demo.opencart.com/index.php?route=account/login", expurl);
		System.out.println("LoginHomePage verified succesfully");
	}
	
	public void userName(String username) {
		WebElement userEmail=driver.findElement(By.xpath("//input[@name='email']"));
		userEmail.sendKeys(username);
	}
	
	public void userPassword(String password) {
		WebElement userPassword=driver.findElement(By.xpath("//input[@name='password']"));
		userPassword.sendKeys(password);
	}
	
	public void loginButton() {
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
	}
	
	public void verifyingHomePage() {
		
		WebElement account=driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
		account.click();
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		Assert.assertTrue(logout.isDisplayed());
		System.out.println("Successfull login");
		
	}

}
