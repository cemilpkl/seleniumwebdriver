package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		boolean isDisplayed = driver.findElement(By.xpath("//h6[normalize-space()='Dummy Form']")).isDisplayed();
		System.out.println(isDisplayed);
		

	}

}
