package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathPractise {

	public static void main(String[] args) {
		
		
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selectorshub.com/xpath-practice-page/");
	driver.findElement(By.xpath("//input[@title='Email']")).sendKeys("Cemil");
	driver.findElement(By.xpath("//input[@Title='Password']")).sendKeys("Pekel");


	}

}
