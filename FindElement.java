package week2.day1;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("9840076622");
		driver.findElement(By.id("pass")).sendKeys("************");
		driver.findElement(By.name("login")).click();
	Thread.sleep(1000);
		String Title = driver.getTitle();
		
		if (Title.contains("fdsfdsfdsfdf")) {
			
			System.out.println("Login Success");
			
		}
		else {System.out.println("Log in failed");}
		
				
				//driver.close();

	}

}
