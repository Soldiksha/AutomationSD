import java.time.Duration;
import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class moveto {



	public static  void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "/Users/dbengani/Documents/chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

driver.get("https://the-internet.herokuapp.com/");

driver.findElement(By.xpath("//a[@href ='/windows']")).click();

driver.findElement(By.linkText("Click Here")).click();

Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

Iterator<String>it = windows.iterator();

String parentId = it.next();

String childId = it.next();

driver.switchTo().window(childId);


System.out.println(driver.findElement(By.xpath(("//div[@class='example']"))).getText());

driver.switchTo().window(parentId);

System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3[text()='Opening a new window']")).getText());

	driver.quit();
	}
}

