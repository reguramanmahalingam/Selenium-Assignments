package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	Thread.sleep(3000);
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");	
	driver.findElement(By.className("decorativeSubmit")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("CRM/SFA")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Accounts")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Create Account")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("accountName")).sendKeys("TestLeafSelenium");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.id("numberEmployees")).sendKeys("100");
	driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	driver.findElement(By.className("smallSubmit")).click();
	Thread.sleep(3000);
	String title = driver.getTitle();
	if(title.contains("Account Details"))
	{
		System.out.println("Title is Account Details : Success");
	}
	else
	{
		System.out.println("Title is wrong");
	}
	driver.close();
	
	}
	
}
