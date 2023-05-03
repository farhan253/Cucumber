package com.opencart.pageobject;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.opencart.utilities.Base;

public class TC_13_VerifyingMissingFieldFucntionalityInCouponCode extends Base{
	
	public void myAccount() {
		WebElement account=driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
		account.click();
		WebElement login=driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Login')]"));
		login.click();
				
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
	public void ShoppingCart(String couponcode) {
		
		WebElement shoppCart=driver.findElement(By.xpath("//span[contains(text(),'Shopping Cart')]"));
    	shoppCart.click();
    	
    	WebElement coupon=driver.findElement(By.xpath("//div[@id='accordion']//a[@href='#collapse-coupon']"));
    	coupon.click();
    	
    	WebElement entercode=driver.findElement(By.xpath("//input[@id='input-coupon']"));
    	entercode.sendKeys(couponcode);
	}
	public void coupon() {
		
		WebElement apply=driver.findElement(By.xpath("//input[@id='button-coupon']"));
    	apply.click();
    	WebElement warning=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
    	Assert.assertTrue(warning.isDisplayed());
    	System.out.println("warning message succesfully displayed");
    	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileHandler.copy(srcfile, new File("C:\\selenium2\\CucumberAssesment\\screenshot\\Coupon.png"));
			System.out.println("screenshot taken");
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	
}
