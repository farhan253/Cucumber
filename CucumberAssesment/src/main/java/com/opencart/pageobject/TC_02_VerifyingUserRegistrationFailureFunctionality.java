package com.opencart.pageobject;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.opencart.utilities.Base;

public class TC_02_VerifyingUserRegistrationFailureFunctionality extends Base{

	
	public void myAccount() {
		WebElement account=driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
		account.click();
		WebElement register=driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		register.click();
				
	}
	
	public void verifyRegisterAccountPage() {
		String acturl,expurl;
		acturl="https://demo.opencart.com/index.php?route=account/register";
		expurl=driver.getCurrentUrl();
		Assert.assertEquals(expurl, acturl);
		System.out.println("Register Account page verified succesfully");
	}
	
	public void firstNameAndLastName(String inputUserFirstName,String inputUserLastName) {
		
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys(inputUserFirstName);
		WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys(inputUserLastName);
	}
	
	public void emailAndTelephone(String userEmail,String number) {
		
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys(userEmail);
		WebElement telephone=driver.findElement(By.xpath("//input[@name='telephone']"));
		telephone.sendKeys(number);
	}
	
	public void passwordAndConfrimPassword(String Userpassword,String confirmUserPassword) {
		
		WebElement userpassword=driver.findElement(By.xpath("//input[@name='password']"));
		userpassword.sendKeys(Userpassword);
		WebElement userConfirmpassword=driver.findElement(By.xpath("//input[@name='confirm']"));
		userConfirmpassword.sendKeys(confirmUserPassword);
		
	}
	
	public void clickCheckBox() {
		WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkBox.click();
	}
	
	public void submit() {
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
	}
	public void verifyingTelephonefeild() {
	WebElement telephone=driver.findElement(By.xpath("//input[@id='input-telephone']"));
	assertTrue(telephone.isDisplayed());
	System.out.println("User registration failed");
	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try{
		FileHandler.copy(srcfile, new File("C:\\selenium2\\CucumberAssesment\\screenshot\\Missing field.png"));
		System.out.println("screenshot taken");
	}catch(IOException e){
		e.printStackTrace();
	}
	
	}

}
