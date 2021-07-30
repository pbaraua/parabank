package com.Utility;import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainParaBank {

	public static void main(String[] args) {
		
		//Second argument is the chromedriver path 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\palas\\Downloads\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://parabank.parasoft.com");
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("papa");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Papa123");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@class='ng-binding'])[4]")).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='leftPanel']")).click();
		driver.findElement(By.xpath("//*[@value='Transfer']")).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='fromAccountId']")).sendKeys("16896");
		driver.findElement(By.xpath("//*[@id='toAccountId']")).sendKeys("16896");
		driver.findElement(By.xpath("//*[@id='amount']")).sendKeys("10");
		
		driver.findElement(By.xpath("//*[@value='Transfer']")).click();
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();

		
	
		
	}

}
