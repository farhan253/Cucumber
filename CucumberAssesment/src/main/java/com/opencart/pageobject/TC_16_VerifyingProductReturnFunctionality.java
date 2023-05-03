package com.opencart.pageobject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.opencart.utilities.Base;

public class TC_16_VerifyingProductReturnFunctionality extends Base {
	
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
	
	public void gotoOrderHistory() {
		WebElement account=driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
		account.click();
		WebElement orderhistory=driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Order History']"));
		orderhistory.click();
	}
	
	public void clickonViewAndReturn() {
		
		WebElement view=driver.findElement(By.xpath("//td[@class='text-right']//i[@class='fa fa-eye']"));
		view.click();
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileHandler.copy(srcfile, new File("C:\\selenium2\\CucumberAssesment\\screenshot\\viewOrderhistory.png"));
			System.out.println("screenshot taken");
		}catch(IOException e){
			e.printStackTrace();
		}
		
		WebElement Return=driver.findElement(By.xpath("//i[@class='fa fa-reply']"));
		Return.click();
		
	}
	
	public void fields() {
		WebElement reason=driver.findElement(By.xpath("//input[@value='2']"));
		reason.click();
		
		WebElement submit=driver.findElement(By.xpath("//input[@value='Submit']"));
		submit.click();
		
		WebElement Continue=driver.findElement(By.xpath("//a[text()='Continue']"));
		Continue.click();
		
	}

}
