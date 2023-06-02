package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'_companyName')]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[contains(@id,'_firstName')]")).sendKeys("janani");
		driver.findElement(By.xpath("//input[contains(@id,'_lastName')]")).sendKeys("S");
		driver.findElement(By.xpath("//input[contains(@id,'_firstNameL')]")).sendKeys("jeni");
		driver.findElement(By.xpath("//input[contains(@id,'_departmentName')]")).sendKeys("java with selenium");
		driver.findElement(By.xpath("//textarea[contains(@id,'_description')]")).sendKeys("learning Purpose");
		driver.findElement(By.xpath("//input[contains(@id,'_primaryEmail')]")).sendKeys("sowmiyaspg@gmail.com");
		WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select option=new Select(element);
		option.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		

	}

	
}
