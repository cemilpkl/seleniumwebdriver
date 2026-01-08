package day25;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//get(url); ==>open the url on the browser
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
	
		//get page title ==>==>open the url on the browser
		String title = driver.getTitle();
		System.out.println("This is the page title: "+title);
		
		
		//get current URL
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//get page source
		//String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		
		
		String window = driver.getWindowHandle();
		System.out.println("Window ID: "+window); //F6E866694F2E6819F4EBFB8A25710239
												  //C098D70E4C203E8210F53F4E8CD30658
		
		//Each time window ID will change
		
		driver.findElement(By.xpath("//button[normalize-space() = 'Click To Open Window Alert']")).click();
		
		
		Set<String> windowIDs = driver.getWindowHandles();
		System.out.println(windowIDs);
		
		
												
		
		
		
	}
	
}