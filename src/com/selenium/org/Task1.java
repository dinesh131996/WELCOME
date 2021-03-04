package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mani\\eclipse-workspace\\Day5selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");

		WebElement drag = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement place = driver.findElement(By.id("amt7"));
		Actions ss = new Actions(driver);
		ss.dragAndDrop(drag, place).build().perform();
		WebElement dragto = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement placeto = driver.findElement(By.id("loan"));
		ss.dragAndDrop(dragto, placeto).build().perform();

		WebElement dragtoo = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement placetoo = driver.findElement(By.id("amt8"));
		ss.dragAndDrop(dragtoo, placetoo).build().perform();

		WebElement dragt = driver.findElement(By.id("credit2"));
		WebElement placet = driver.findElement(By.id("bank"));
		ss.dragAndDrop(dragt, placet).build().perform();

		Thread.sleep(3000);
		driver.quit();

	}

}
class Table{
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mani\\eclipse-workspace\\Day5selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/BookedItinerary.php");

		Thread.sleep(10000);
		String findElement = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[2]")).getText();
	System.out.println(findElement);
	}
		
		
		
	
}
