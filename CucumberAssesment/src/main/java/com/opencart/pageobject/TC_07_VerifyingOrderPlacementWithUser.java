package com.opencart.pageobject;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.opencart.utilities.Base;

public class TC_07_VerifyingOrderPlacementWithUser extends Base {
	
	
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
	
	 public void mouseOverOnLaptopsAndNotebooks() throws InterruptedException {
			
			WebElement laptops=driver.findElement(By.xpath("//a[contains(text(),'Laptops & Notebooks')]"));
		    Actions act=new Actions(driver);
			act.moveToElement(laptops).build().perform();	
		}
	    public void selectingallLaptops() {
	    	WebElement selectlaptops=driver.findElement(By.xpath("//a[contains(text(),'Show All Laptops & Notebooks')]"));
			selectlaptops.click();
	    }
	    public void selectHPLaptop() {
		WebElement Hplaptop=driver.findElement(By.xpath("//div[@class='product-thumb']//a[contains(text(),'HP LP3065')]"));
		Hplaptop.click();
	}
	    public void changeDate(String date) {
	    	Actions scroll=new Actions(driver);
			scroll.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
			WebElement delivery=driver.findElement(By.xpath("//input[@id='input-option225']"));
			delivery.sendKeys(date);	
	    }
	    public void Addcart() {
	    	WebElement cart=driver.findElement(By.id("button-cart"));
	    	cart.click();
	    }
	    
	    public void ItembasketAndCheckout() throws InterruptedException {
	    	WebElement items=driver.findElement(By.xpath("//span[@id='cart-total']"));
	    	items.click();
	    	WebElement checkOut=driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong"));
	    	checkOut.click();
	    	Thread.sleep(2000);
	    }
	    
	    public void deleteItem() throws InterruptedException {
	    	WebElement deletenotavaibleItem=driver.findElement(By.xpath("//button[@type='button']//i[@class='fa fa-times-circle']"));
	    	deletenotavaibleItem.click();
	    	WebElement checkOut=driver.findElement(By.xpath("//a[text()='Checkout']"));
	    	checkOut.click();
	    	Thread.sleep(2000);
	    	WebElement checkOut1=driver.findElement(By.xpath("//a[text()='Checkout']"));
	    	checkOut1.click();
	    	
	    	
	    }
	    public void BillingAddress() {
	    	WebElement billing =driver.findElement(By.xpath("//input[@id='button-payment-address']"));
	    	billing.click();
	    }
	    public void deliverydetails() throws InterruptedException {
	    	Thread.sleep(2000);
	    	WebElement delivery =driver.findElement(By.xpath("//input[@id='button-shipping-address']"));
	    	delivery.click();
	    }
	    public void deliveriMethod() throws InterruptedException {
	    	Thread.sleep(2000);
	    	WebElement deliverymethod =driver.findElement(By.xpath("//input[@id='button-shipping-method']"));
	    	deliverymethod.click();
	    	
	    	
	    }
	    public void cashOnDelivery() throws InterruptedException {
	    	Thread.sleep(2000);
	    	WebElement checkbox =driver.findElement(By.xpath("//input[@name='agree']"));
	    	checkbox.click();
	    	Thread.sleep(2000);
	    	WebElement cash =driver.findElement(By.xpath("//input[@id='button-payment-method']"));
	    	cash.click();
	    }
	    public void confirm() throws InterruptedException {
	    	
	    	WebElement confrim =driver.findElement(By.xpath("//input[@id='button-confirm']"));
	    	confrim.click();
	    	Thread.sleep(2000);
	    	WebElement confirmmessage=driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
	    	Assert.assertTrue(confirmmessage.isDisplayed());
	    	System.out.println("order is placed succesfully");
	    	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try{
				FileHandler.copy(srcfile, new File("C:\\selenium2\\CucumberAssesment\\screenshot\\OrderConfirmationUser.png"));
				System.out.println("screenshot taken");
			}catch(IOException e){
				e.printStackTrace();
			}
	    	
	    }

}
