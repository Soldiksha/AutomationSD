import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/dbengani/Documents/chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); //URL in the browser
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());

		//Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		
	
       Thread.sleep(2000L);
      
       
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		
		  Thread.sleep(2000L);
	      
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());

		//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
   
     driver.quit();
		
	}

}
