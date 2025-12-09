package day21;

import org.openqa.selenium.chrome.*;

public class FirstTestCase {
	
	public static void main(String[] args) {
		
		System.out.println("Testing...");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
	
	
		String actualTitle = driver.getTitle();
		
		
		if(actualTitle.equals("OpenCart - Demo")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
			
		System.out.println("Actual Title: " + actualTitle);
		}
		
		driver.quit();
		
	}

}
