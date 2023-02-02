import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class invoke {
	public static  void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/dbengani/Documents/chromedriver.exe");
	WebDriver driver  = new ChromeDriver();	
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	//name
	driver.findElement(By.name("name")).sendKeys("Diksha Bengani");
	Thread.sleep(1000L);
	//email
	driver.findElement(By.name("email")).sendKeys("dikshab123@gmail.com");
	Thread.sleep(1000L);
	//password
	driver.findElement(By.id("exampleInputPassword1")).sendKeys("hello123");
	Thread.sleep(1000L);
	//checkbox
		driver.findElement(By.id("exampleCheck1")).click();
	Thread.sleep(1000L);
	//gender dropdown
	//driver.findElement(By.cssSelecter("exampleFormControlSelect1")[1]).click();
	// Create the object of the Select class
	Select se = new Select(driver.findElement(By.xpath("//*[@id='exampleFormControlSelect1']")));
				
	// Select the option using the visible text
	se.selectByVisibleText("Female");
	//driver.findElement(By.xpath("//*[@id='exampleFormControlSelect1']")).selectByVisibleText("Female");
	
	Thread.sleep(1000L);
	//radio button 
	driver.findElement(By.id("inlineRadio2")).click();
	Thread.sleep(1000L);
	//Calender DOB
	//driver.findElement(By.name("bday")).click();
	//Thread.sleep(2000L);
	//driver.findElement(By.name("bday")).click();
	//Thread.sleep(1000L);
	//click submit //bybutton
	driver.findElement(By.cssSelecter(".btn btn-success")).click();
	Thread.sleep(1000L);
	//output message
	System.out.println(driver.findElement(By.className("alert alert-success alert-dismissible")).getText());
	Thread.sleep(3000L);
	driver.quit();
	}}

