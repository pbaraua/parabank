package com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankHighLight {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\palas\\Downloads\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://parabank.parasoft.com");
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Paul");
		WebElement email = driver.findElement(By.xpath("//*[@name='username']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='5px solid red'", email);
		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Paul_1971");
		WebElement passwd= driver.findElement(By.xpath("//*[@name='password']"));
		JavascriptExecutor js1 =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='5px solid red'", passwd);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.close();

	}

}
