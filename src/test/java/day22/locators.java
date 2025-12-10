package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		WebElement newsletter = driver.findElement(By.xpath("//img[@title='OpenCart - Demo']"));
		
		//newsletter.sendKeys("cemil");
		
		boolean isDisplayed = newsletter.isDisplayed();
		System.out.println("Is Displayed: " + isDisplayed);
		driver.quit();


	}
}
