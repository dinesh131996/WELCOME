package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fraem {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mani\\eclipse-workspace\\Day5selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");
		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("juke");
		
		driver.switchTo().parentFrame();
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		findElement.click();
		
		WebElement findElement2 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(findElement2);
		
		WebElement findElement3 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(findElement3);
		
		WebElement findElement4 = driver.findElement(By.xpath("//input[@type='text']"));
		findElement4.sendKeys("hello");

	}

}
