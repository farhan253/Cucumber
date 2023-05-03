package com.opencart.pageobject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.opencart.utilities.Base;

public class TC_15_VerifyingWishListFunctionality extends Base{
	
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
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		
	}
	
	public void mouseOveringOnComponents() throws InterruptedException {
		Thread.sleep(3000);
		WebElement mouseover=driver.findElement(By.xpath("//a[text()='Components']"));
		Actions act=new Actions(driver);
		act.moveToElement(mouseover).build().perform();
		
		WebElement monitor=driver.findElement(By.xpath("//a[text()='Monitors (2)']"));
		monitor.click();
	}
	public void sortby() {
		Select sort=new Select(driver.findElement(By.xpath("//select[@id='input-sort']")));
		sort.selectByVisibleText("Price (High > Low)");
	}
	public void checkwishlist() {
		WebElement wishlist=driver.findElement(By.xpath("//div[@class='button-group']//i[@class='fa fa-heart']"));
		wishlist.click();
		WebElement gotowishlist=driver.findElement(By.xpath("//*[@id=\"wishlist-total\"]/span"));
		gotowishlist.click();
		
	}
	public void addCart() {
		WebElement cart=driver.findElement(By.xpath("//*[@id=\"content\"]//i[@class='fa fa-shopping-cart']"));
		cart.click();
		
		WebElement shoppCart=driver.findElement(By.xpath("//span[contains(text(),'Shopping Cart')]"));
    	shoppCart.click();
    	
    	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileHandler.copy(srcfile, new File("C:\\selenium2\\CucumberAssesment\\screenshot\\wishlist.png"));
			System.out.println("screenshot taken");
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
