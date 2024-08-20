package week2.day2;


import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AttributeXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//driver.close();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.findElements(XPath("//"))
		
		driver.close();
	}

}
