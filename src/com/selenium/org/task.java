package com.selenium.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task {
	public static void task2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mani\\eclipse-workspace\\Day5selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
		Actions as = new Actions(driver);
		as.doubleClick(element).build().perform();
		WebElement element2 = driver.findElement(By.xpath("//div[text()='Mobiles, Computers']"));
		as.doubleClick(element2).build().perform();

		Thread.sleep(3000);
		driver.quit();
	}

	public static void task3() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mani\\eclipse-workspace\\Day5selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		Actions as = new Actions(driver);
       // Thread.sleep(5000);
		WebElement close_button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		as.click(close_button).build().perform();
		
		
		WebElement home = driver.findElement(By.xpath("//img[@alt='Home']"));
		as.moveToElement(home).build().perform();

		WebElement textofhome = driver.findElement(By.xpath("//a[text()='Home Furnishings']"));
		as.click(textofhome).build().perform();
		
		//Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement findElement = driver.findElement(By.xpath("(//a[@class='_6WQwDJ'])[1]"));
		as.click(findElement).build().perform();
		
		WebElement findElement2 = driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[2]"));
		as.click(findElement2).build().perform();
		
		//Thread.sleep(5000);
		WebElement findElement3 = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
		///html/body/div/div/div[3]/div/div/div[2]/div/ul/li[@class='col col-6-12']/button
		findElement3.click();
		//Thread.sleep(10000);
		//driver.quit();
		
		

	}

	public static void task4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mani\\eclipse-workspace\\Day5selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gettyimages.in/");

		Actions as = new Actions(driver);
		WebElement click = driver.findElement(By.xpath("(//a[text()='EDITORIAL'])[2]"));
		as.click(click).build().perform();

		WebElement entertainment = driver
				.findElement(By.xpath("//figcaption[text()='2021 Entertainment Pictures Of The Week']"));
		as.click(entertainment).build().perform();

		Thread.sleep(5000);
		driver.quit();

	}
	public static void task20() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mani\\eclipse-workspace\\Day5selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.t-mobile.com/?src=spr&rdpage=%2F");
		driver.manage().window().maximize();
		Actions as = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement findElement3 = driver.findElement(By.xpath("//button[@class='tntOverlayCloseBtn']"));
		as.click(findElement3).build().perform();
		
		WebElement findElement = driver.findElement(By.id("user-links-dropdown"));
		as.click(findElement).build().perform();
		
		WebElement findElement2 = driver.findElement(By.xpath("//a[text()=' Bill pay ']"));
		as.click(findElement2).build().perform();

	}
public static void task21() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Mani\\eclipse-workspace\\Day5selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.t-mobile.com/?src=spr&rdpage=%2F");
	driver.manage().window().maximize();
	Actions as = new Actions(driver);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement findElement3 = driver.findElement(By.xpath("//button[@class='tntOverlayCloseBtn']"));
	as.click(findElement3).build().perform();
	
	WebElement findElement = driver.findElement(By.id("digital-header-nav-link-head-0"));
	
	as.moveToElement(findElement).build().perform();
	
	WebElement findElement2 = driver.findElement(By.xpath("//span[text()='Unlimited Age 55+']"));
	as.click(findElement2).build().perform();
	

}
public static void task19() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Mani\\eclipse-workspace\\Day5selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Actions as = new Actions(driver);
	
	WebElement close_but = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	as.click(close_but).build().perform();
	
	WebElement fasion_icon = driver.findElement(By.xpath("//img[@alt='Fashion']"));
	as.moveToElement(fasion_icon).build().perform();
	
	WebElement womens_footwear = driver.findElement(By.xpath("//a[text()='Women Footwear']"));
	as.moveToElement(womens_footwear).build().perform();
	
	WebElement flat_wear = driver.findElement(By.xpath("//a[text()='Women Slipper Flip Flops']"));
	as.click(flat_wear).build().perform();

}
public static void task18() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Mani\\eclipse-workspace\\Day5selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Actions as = new Actions(driver);
	
	WebElement mouse_over = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	as.moveToElement(mouse_over).build().perform();
	
	WebElement click_signin = driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
	as.click(click_signin).build().perform();
	
	WebElement give_email = driver.findElement(By.id("ap_email"));
	as.sendKeys(give_email, "8344787974").build().perform();
	
	WebElement continue_button= driver.findElement(By.id("continue"));
	as.click(continue_button).build().perform();
	
	WebElement give_password = driver.findElement(By.id("ap_password"));
	as.sendKeys(give_password, "123456").build().perform();
	
	WebElement click_siignin = driver.findElement(By.id("signInSubmit"));
	as.click(click_siignin).build().perform();
	
}
public static void task17() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Mani\\eclipse-workspace\\Day5selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Actions as = new Actions(driver);
	WebElement select_all = driver.findElement(By.xpath("(//span[text()='All'])[2]"));
	as.click(select_all).build().perform();
	

	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,2203)");
	System.out.println(driver.findElement(By.xpath("//div[text()='TV, Appliances, Electronics']")).getLocation().getY());
	WebElement click_mobile = driver.findElement(By.xpath("//div[text()='TV, Appliances, Electronics']"));
	as.click(click_mobile).build().perform();
	
	driver.quit();
	
	
}
public void task16() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Mani\\eclipse-workspace\\Day5selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	Actions as = new Actions(driver);
	WebElement mouse_hover = driver.findElement(By.id(""));
	as.click(mouse_hover).build().perform();
	
}
public static void work() {
StringBuffer buffer = new StringBuffer("java");
long currentTimeMillis = System.currentTimeMillis();

System.out.println(System.identityHashCode(buffer));
buffer.append("hike");
System.out.println(buffer);
System.out.println(System.identityHashCode(buffer));


System.out.println(System.currentTimeMillis()-currentTimeMillis);

StringBuilder builder = new StringBuilder("greens");
builder.append('5');
long currentTimeMillis2 = System.currentTimeMillis();
System.out.println(System.currentTimeMillis()-currentTimeMillis2);

	
}


	public static void main(String[] args) throws InterruptedException {
	//task 3 is pending
		//task17();
		work();
		
	}
}



class animal{
public void boy() {
System.out.println("dinesh");
}	
public void girl() {
System.out.println("vignesh");
}
	
}

class dog extends animal{
@Override
public void boy() {
	super.boy();
	System.out.println("vignesh");
}
public static void main(String[] args) {
	dog d = new dog();
	d.boy();
	d.girl();
}
}
class Happen{
	public Happen(int a) {
System.out.println("ads"+a);
	}
	public Happen() {
System.out.println("dinesh");
	}
	public static void main(String[] args) {
	Happen h = new Happen(123);
	Happen k = new Happen();
	}
	
	
}
class Happy extends Happen{
public Happy(int b) {
	super(456);
	System.out.println("dsf"+b);
}
public Happy() {
	super(254);
System.out.println("vignesh");
}
public static void main(String[] args) {
	Happy j= new Happy();
	Happy jk= new Happy(589);
}
}
enum boy{
HIKE,KINJ,SDKDSF,
	JACK,IK;
	
}
class love{
	 public void JUKE(int...a) {
		 for (int i : a) {
			 System.out.println(""+i);	 
		}

	
	}
	public static void main(String[] args) {
	System.out.println( boy.HIKE);
	love lo = new love();
	lo.JUKE(1,2,5,6);
	lo.JUKE(10);
	
	}
}
class king
{
	public static void boy() {
int i=2;
int j=0; 
try {
	System.out.println(i/j);
} catch (Exception e) {
	System.out.println("dinesh");
}
	}
public static void main(String[] args) {
	boy();
}	
}

class selenium{
	public static void main(String[] args) throws Exception {
		
		//throw new Exception("hike");
		System.out.println(10+20+"lll");
		System.out.println("lll"+10+20);
		
		
}
}
