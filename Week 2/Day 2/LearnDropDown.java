package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		//driver.close();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Leaf");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Selenium");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Course");
		
		WebElement Source = driver.findElement(By.className("createLeadForm_dataSourceId"));
		Select Opt = new Select(Source);
		Opt.selectByIndex(5);
		
		WebElement Source1 = driver.findElement(By.className("createLeadForm_marketingCampaignId"));
		Select Opt1 = new Select(Source1);
		Opt1.selectByValue("CATRQ_AUTOMOBILE");
	
		WebElement Source2 = driver.findElement(By.className("createLeadForm_currencyUomId"));
		Select Opt2 = new Select(Source2);
		Opt2.selectByVisibleText("KPW - North Korean Won");
		Thread.sleep(5000);
		
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
		
	}

}