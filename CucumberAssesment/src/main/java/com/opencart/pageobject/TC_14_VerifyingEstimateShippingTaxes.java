package com.opencart.pageobject;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.opencart.utilities.Base;

public class TC_14_VerifyingEstimateShippingTaxes extends Base{

	
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
	public void shoppinCartAndViewCart() {
		WebElement shoppCart=driver.findElement(By.xpath("//span[contains(text(),'Shopping Cart')]"));
    	shoppCart.click();
	}
	public void EstimateShippingTaxes(String Postalcode) {
		WebElement taxes=driver.findElement(By.xpath("//*[@id='accordion']//a[@href='#collapse-shipping']"));
		taxes.click();
		Select country=new Select(driver.findElement(By.name("country_id")));
    	country.selectByValue("99");
    	
    	Select State=new Select(driver.findElement(By.name("zone_id")));
    	State.selectByValue("1476");
    	WebElement postal=driver.findElement(By.xpath("//input[@id='input-postcode']"));
    	postal.clear();
    	postal.sendKeys(Postalcode);
	}
	
	public void clickQuoteApplyshipping() throws InterruptedException {
		WebElement getQuotebutton=driver.findElement(By.xpath("//button[text()='Get Quotes']"));
		getQuotebutton.click();
		
		WebElement radioButton=driver.findElement(By.xpath("//input[@name='shipping_method']"));
		radioButton.click();
		
		
		try {
			WebElement Apply=driver.findElement(By.xpath("//input[@id='button-shipping']"));
			Apply.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			WebElement Apply=driver.findElement(By.xpath("//input[@id='button-shipping']"));
			Apply.click();
		}
		
		
		WebElement message=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		
		Assert.assertTrue(message.isDisplayed());
		System.out.println("verified success message");
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileHandler.copy(srcfile, new File("C:\\selenium2\\CucumberAssesment\\screenshot\\tax.png"));
			System.out.println("screenshot taken");
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		}
	public void clickcheckOut() throws InterruptedException {
		
		Actions scroll=new Actions(driver);
		scroll.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
		WebElement CheckOut=driver.findElement(By.xpath("//a[text()='Checkout']"));
		CheckOut.click();	
	}
	public void billingdetails() throws InterruptedException {
		Set<String> allwindows=driver.getWindowHandles();
		Object[] windows=allwindows.toArray();
		String window1=windows[0].toString();
		String window2=windows[1].toString();
		driver.switchTo().window(window2);
		
		
		WebElement billing=driver.findElement(By.xpath("//input[@id='button-payment-address']"));
		billing.click();
	}
	public void deliveringdetails() throws InterruptedException {
		Thread.sleep(2000);
		WebElement deliverydetails=driver.findElement(By.xpath("//input[@id='button-shipping-address']"));
		deliverydetails.click();
	}
	public void deliverymethod() throws InterruptedException {
		WebElement deliverymethod=driver.findElement(By.xpath("//input[@id='button-shipping-method']"));
		deliverymethod.click();
		
		
	}
	public void paymentMethod() throws InterruptedException {
		
		WebElement agree=driver.findElement(By.xpath("//input[@name='agree']"));
		agree.click();
		WebElement paymentmethod=driver.findElement(By.xpath("//input[@id='button-payment-method']"));
		paymentmethod.click();
	}
	public void buttonconfirm() {
		WebElement confirm=driver.findElement(By.xpath("//input[@id='button-confirm']"));
		confirm.click();
		
		WebElement next=driver.findElement(By.xpath("//a[text()='Continue']"));
		next.click();
	}
	
	
}
