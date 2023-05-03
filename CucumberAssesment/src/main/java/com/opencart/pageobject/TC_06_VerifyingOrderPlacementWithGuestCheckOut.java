package com.opencart.pageobject;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opencart.utilities.Base;

public class TC_06_VerifyingOrderPlacementWithGuestCheckOut extends Base {
	
	
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
	    
	    public void ItembasketAndCheckout() {
	    	WebElement items=driver.findElement(By.xpath("//span[@id='cart-total']"));
	    	items.click();
	    	WebElement checkOut=driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong"));
	    	checkOut.click();
	    }
	    public void guestCheckOut() {
	    	WebElement radio=driver.findElement(By.xpath("//input[@value='guest']"));
	    	radio.click();
	    	WebElement next=driver.findElement(By.id("button-account"));
	    	next.click();
	    }
	    public void fillingBillingdetails(String Firstname,String Lastname,String Email,String telephone,String address1,String City,String Postalcode
	    		) throws InterruptedException {
	    	
	    	
	    	WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
	    	firstname.sendKeys(Firstname);
	    	
	    	
	    	WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
	    	lastname.sendKeys(Lastname);
	    	
	    	
	    	WebElement email=driver.findElement(By.xpath("//*[@id='input-payment-email']"));
	    	email.sendKeys(Email);
	    	
	    	
	    	WebElement phone=driver.findElement(By.xpath("//input[@name='telephone']"));
	    	phone.sendKeys(telephone);
	    	
	    	
	    	WebElement adress1=driver.findElement(By.xpath("//input[@name='address_1']"));
	    	adress1.sendKeys(address1);
	    	
	    	
	    	WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
	    	city.sendKeys(City);
	    	
	    	
	    	
	    	WebElement postal=driver.findElement(By.xpath("//input[@id='input-payment-postcode']"));
	    	postal.sendKeys(Postalcode);
	    	
	    	
	    	Thread.sleep(1000);
	    	Select country=new Select(driver.findElement(By.name("country_id")));
	    	country.selectByVisibleText("India");
	    	
	    	Thread.sleep(1000);
	    	Select State=new Select(driver.findElement(By.name("zone_id")));
	    	State.selectByVisibleText("Andhra Pradesh");
	    	
	    	
	    	Thread.sleep(1000);
	    	WebElement submit=driver.findElement(By.xpath("//*[@id='button-guest']"));
	    	submit.click();
	    		
	    }
	    public void deliveringMethod() throws InterruptedException {
	    	Thread.sleep(2000);
	    	WebElement Next=driver.findElement(By.id("button-shipping-method"));
	    	Next.click();
	    	try{
	    	} catch (Exception e) {
	    	if(e.toString().contains("org.openqa.selenium.UnhandledAlertException"))
	    	 {
	    	    Alert alert = getDriver().switchTo().alert();
	    	    alert.accept();
	    	 }
	    	}
	    	Thread.sleep(3000);
	    }
	    
	    private WebDriver getDriver() {
			// TODO Auto-generated method stub
			return null;
		}
		public void cashOndelivery() throws InterruptedException {
	    	
	    	WebElement checkbox=driver.findElement(By.xpath("//div[@class='pull-right']//input[@type='checkbox']"));
	    	checkbox.click();
	    	Thread.sleep(2000);
	    	WebElement Next=driver.findElement(By.id("button-payment-method"));
	    	Next.click();
	    }
	    public void confirm() {
	    	WebElement confirm=driver.findElement(By.id("button-confirm"));
	    	confirm.click();
	    	WebElement confirmationMessage=driver.findElement(By.xpath("//*[@id='content']//*[contains(text(),'Your order has been placed!')]"));
	    	assertTrue(confirmationMessage.isDisplayed());
	    	System.out.println("order placed succesfully");
	    	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try{
				FileHandler.copy(srcfile, new File("C:\\selenium2\\CucumberAssesment\\screenshot\\OrderConfirmationGuest.png"));
				System.out.println("screenshot taken");
			}catch(IOException e){
				e.printStackTrace();
			}
	    	
	    }
	    

}
