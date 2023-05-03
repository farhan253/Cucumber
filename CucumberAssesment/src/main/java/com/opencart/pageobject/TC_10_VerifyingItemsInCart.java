package com.opencart.pageobject;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.opencart.utilities.Base;

public class TC_10_VerifyingItemsInCart extends Base{
	
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
	public void SearchItem(String item) throws InterruptedException {
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//input[@name='search']"));
		search.sendKeys(item);
		WebElement select=driver.findElement(By.xpath("//*[@id=\'search\']/span/button/i"));
		select.click();
	}
	public void selectIphone(String Quantity) {
		WebElement iphone=driver.findElement(By.xpath("//div[@class='caption']//a[contains(text(),'iPhone')]"));
		iphone.click();
		WebElement quantity=driver.findElement(By.xpath("//input[@name='quantity']"));
		quantity.clear();
		quantity.sendKeys(Quantity);
	}
	public void addCart() {
		WebElement cart=driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]"));
		cart.click();
	}
	
	public void itemsCart() {
		WebElement items=driver.findElement(By.xpath("//span[@id='cart-total']"));
		items.click();
	}
	public void checkout() {
		WebElement checkout=driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong"));
		checkout.click();
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileHandler.copy(srcfile, new File("C:\\selenium2\\CucumberAssesment\\screenshot\\Product.png"));
			System.out.println("screenshot taken");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	
	

}
