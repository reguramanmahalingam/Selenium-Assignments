package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//a[text() ='Create new account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Reguraman");
		driver.close();
		
	}

}
