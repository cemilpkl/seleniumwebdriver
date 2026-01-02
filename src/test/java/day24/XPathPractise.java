package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathPractise {

	public static void main(String[] args) {
		
		
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selectorshub.com/xpath-practice-page/");
	
	//xpath with single tag
	driver.findElement(By.xpath("//input[@title='Email']")).sendKeys("Cemil");
	driver.findElement(By.xpath("//input[@Title='Password']")).sendKeys("Pekel");
	
	
	
	//xpath with text() method -->inner text
	boolean isDisplayed = driver.findElement(By.xpath("//h6[text()='Dummy Form']")).isDisplayed();
	System.out.println("Is dummy text"+ isDisplayed);
	
	String formText = driver.findElement(By.xpath("//h6[text()='Dummy Form']")).getText();//getText method for String result
	System.out.println(formText);
	
	//xpath with AND/OR
	driver.findElement(By.xpath("//input[@title='Email and @Title='Password']")).sendKeys("Cemil");
	driver.findElement(By.xpath("//input[@title='Email or @Title='Password']")).sendKeys("Pekel");
	
	
	//xpath with contains
	//tag[contains(@attribute,'value')]
	
	driver.findElement(By.xpath("//button[contains(@value,'Submit')]")).click();
	
	
	//xpath with starts-with method
	//tag[starts-with(@attribute,'value')]
	driver.findElement(By.xpath("//button[starts-with(@value,'Sub')]")).click();
	
	
	
	
	
	
	
	


	}

}
