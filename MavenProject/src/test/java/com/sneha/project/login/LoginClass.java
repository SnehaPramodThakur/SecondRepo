package com.sneha.project.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("https://www.orangehrm.com/");
		d.manage().window().maximize();
		
		WebElement stbn=d.findElement(By.xpath("//*[@id=\'navbarSupportedContent\']/div[2]/ul/li[1]/a/button"));
        stbn.click();
        
        WebElement stbn1=d.findElement(By.xpath("//*[@id=\'Form_getForm_FullName\']"));
        stbn1.sendKeys("Sneha");
        
        WebElement stbn2=d.findElement(By.xpath("//*[@id=\'Form_getForm_Email\']"));
        stbn2.sendKeys("Sneha@cmail.com");
        
        WebElement dropd=d.findElement(By.xpath("//*[@id=\'Form_getForm_Country\']"));
        Select ddn=new Select(dropd);
        ddn.selectByVisibleText("India");
        
        WebElement stbn4=d.findElement(By.xpath("//*[@id=\'Form_getForm_Contact\']"));
        stbn4.sendKeys("123456789");
        
        WebElement stbn5=d.findElement(By.xpath("//*[@id=\'Form_getForm_action_submitForm\']"));
        stbn5.click();
		
	}
}
