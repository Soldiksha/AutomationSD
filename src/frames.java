import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {



	public static  void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "/Users/dbengani/Documents/chromedriver.exe");
		
WebDriver driver = new ChromeDriver();


driver.get("https://the-internet.herokuapp.com/");
driver.findElement(By.xpath("//a[@href ='/nested_frames']")).click();
WebElement topframe = driver.findElement(By.xpath("//frame[@name='frame-top']"));   
String frame1 =  driver.switchTo().frame(topframe).switchTo().frame("frame-middle").findElement(By.xpath("//body")).getText();                
System.out.println(frame1);
//List<WebElement> nestedFrames = driver.switchTo().frame(topframe).findElements(By.tagName("frame"));
//System.out.println(nestedFrames.size());



}}