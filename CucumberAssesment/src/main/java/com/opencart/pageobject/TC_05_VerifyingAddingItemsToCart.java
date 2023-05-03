package com.opencart.pageobject;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.opencart.utilities.Base;

public class TC_05_VerifyingAddingItemsToCart extends Base {
	
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
	
	public void mouseOverOnDesktop() throws InterruptedException {
		
		WebElement desktop=driver.findElement(By.xpath("//a[text()='Desktops']"));
	    Actions act=new Actions(driver);
		act.moveToElement(desktop).build().perform();
		
	}
	public void clickOnMac() throws InterruptedException {
		
		WebElement mac=driver.findElement(By.xpath("//a[contains(text(),'Mac (1)')]"));
		mac.click();
		
		
	}
	public void addTocart() throws InterruptedException {
		
		Actions scroll=new Actions(driver);
		scroll.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		WebElement cart=driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]"));
		cart.click();
	
		
		
	}
	public void addedSuccesfullymessage() {
		WebElement successmessage=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		assertTrue(successmessage.isDisplayed());
		System.out.println("Item added succesfully");
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileHandler.copy(srcfile, new File("C:\\selenium2\\CucumberAssesment\\screenshot\\addcart.png"));
			System.out.println("screenshot taken");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
		
	
	

}
