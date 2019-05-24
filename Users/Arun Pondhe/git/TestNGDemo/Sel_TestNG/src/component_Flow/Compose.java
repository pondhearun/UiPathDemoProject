package component_Flow;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation_Framework.First_Test;

public class Compose extends First_Test {

	@Test(priority=2,dependsOnMethods= {"login"})
	@Parameters({"To","Subject"})
	public void Send_Email(String To,String Subject) {

		//click on compose button
		driver.findElement(By.xpath("//DIV[@class='T-I J-J5-Ji T-I-KE L3 T-I-JW T-I-JO'][text()='Compose']/self::DIV"))
				.click();

		driver.findElement(By.xpath("//TEXTAREA[@id=':1oh']\n")).sendKeys(To);
		driver.findElement(By.xpath("//INPUT[@id=':1nz']\n")).sendKeys(Subject);
		
		driver.findElement(By.xpath("")).sendKeys("Hello Gmail");
		driver.findElement(By.xpath("//DIV[@id=':1p4']\n" )).click();
	}
}
