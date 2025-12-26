package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//tag& id    ==> tag#id
		driver.get("https://demo.nopcommerce.com/");
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Iphone");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Iphone");
		
		
		//tag & class ==> tag.id
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Iphone");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Iphone");
		
		
		//tag & attribute ==>tag[attribute='value']
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Iphone");
		//driver.findElement(By.cssSelector("[name='q']")).sendKeys("Iphone");
		
		
		//tag & class & attribute ==> tag.class[attribute='value']
		
		driver.findElement(By.cssSelector("input.search-box-text[type='text']")).sendKeys("Iphone");
		driver.findElement(By.cssSelector(".search-box-text[type='text']")).sendKeys("Iphone");
		
		

	}

}
