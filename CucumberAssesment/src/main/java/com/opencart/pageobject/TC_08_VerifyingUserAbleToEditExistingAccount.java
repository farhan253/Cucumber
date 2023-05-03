package com.opencart.pageobject;

import java.util.Set;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.opencart.utilities.Base;

public class TC_08_VerifyingUserAbleToEditExistingAccount extends Base {
	
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
	
	public void loginButton() throws InterruptedException {
		WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
		login.click();
		
	}
	
	public void selectEditAccount() {
		WebElement editaccount=driver.findElement(By.xpath("//a[contains(text(),'Edit your account information')]"));
		editaccount.click();
	}
	
	public void editLastName(String LastName) {
		WebElement lastName=driver.findElement(By.name("lastname"));
		lastName.clear();
		lastName.sendKeys(LastName);
		WebElement continuee=driver.findElement(By.xpath("//input[@value='Continue']"));
		continuee.click();
		
	}
	public void verifyingTheSuccessMsg() {
		
		WebElement alert=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		Assert.assertTrue(alert.isDisplayed());
		System.out.println("success: Your account as been successfully updated");
		Actions scroll=new Actions(driver);
		scroll.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	
	}
	
	public void logOut() throws InterruptedException  {
		Thread.sleep(2000);
		Actions scroll=new Actions(driver);
		scroll.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		WebElement logout=driver.findElement(By.xpath("//div[@class='list-group']//a[contains(text(),'Logout')]"));
		logout.click(); 	
	}
	public void Continue() throws InterruptedException {
		Thread.sleep(2000);
		Set<String> allwindows=driver.getWindowHandles();
		Object[] windows=allwindows.toArray();
		String window1=windows[0].toString();
		String window2=windows[1].toString();
		driver.switchTo().window(window2);
		WebElement next=driver.findElement(By.xpath("//a[contains(text(),'Continue')]"));
		next.click();
	}
	

}
