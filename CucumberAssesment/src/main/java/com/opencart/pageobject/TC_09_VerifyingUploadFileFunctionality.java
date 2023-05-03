package com.opencart.pageobject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.opencart.utilities.Base;

public class TC_09_VerifyingUploadFileFunctionality extends Base{
	
	public void mouseoverComponentTab() {
		WebElement component=driver.findElement(By.xpath("//a[text()='Components']"));
		Actions act=new Actions(driver);
		act.moveToElement(component).build().perform();
		
		WebElement monitor=driver.findElement(By.xpath("//a[text()='Monitors (2)']"));
		monitor.click();
	}
	public void clickOnAppleCinema30() {
		WebElement appleCinema30=driver.findElement(By.xpath("//a[text()='Apple Cinema 30\"']"));
		appleCinema30.click();
		
	}
	public void enterfileds(String text,String text2) {
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		
		WebElement Text=driver.findElement(By.xpath("//input[@name='option[208]']"));
		Text.sendKeys(text);
		
		WebElement text1=driver.findElement(By.xpath("//textarea[@name='option[209]']"));
		text1.sendKeys(text2);
		
	}
	
	public void addTocart() {
		WebElement cart= driver.findElement(By.xpath("//button[@id='button-cart']"));
		cart.click();
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileHandler.copy(srcfile, new File("C:\\selenium2\\CucumberAssesment\\screenshot\\UploadFile.png"));
			System.out.println("screenshot taken");
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
