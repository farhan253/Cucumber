package com.opencart.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.opencart.utilities.Base;

public class TC_11_VerifyingUserIsAbleToRemoveItemsInCart extends Base {
	
	
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
	WebElement cart=driver.findElement(By.id("button-cart"));
	cart.click();
    }
    
    public void clickOnShoppingCart() {
    	
    	WebElement shoppCart=driver.findElement(By.xpath("//span[contains(text(),'Shopping Cart')]"));
    	shoppCart.click();
    	
    }
    public void clickOnRemoveItems() {
    	WebElement remove=driver.findElement(By.xpath("//div[@class='input-group btn-block' ]//i[@class='fa fa-times-circle']"));
    	remove.click();
    	System.out.println("succesfully deleted items");
    	WebElement next=driver.findElement(By.xpath("//a[contains(text(),'Continue')]"));
    	next.click();
    }
    
    
}
