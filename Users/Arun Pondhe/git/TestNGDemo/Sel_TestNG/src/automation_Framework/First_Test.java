package automation_Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class First_Test {

	public WebDriver driver;

	@BeforeMethod
	@Parameters({ "url" })
	public void setUp(String url) {
		System.setProperty("webdriver.gecko.driver",
				"F:\\eclipse-workspace\\Sel_TestNG\\src\\automation_Framework\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
	}

	@Test(priority=1)
	@Parameters({ "username", "password" })
	public void login(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath("//INPUT[@id='identifierId']\n")).sendKeys(username);
		;
		driver.findElement(By.xpath("//SPAN[@class='RveJvd snByac'][text()='Next']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//INPUT[@type='password']")).sendKeys(password);

		driver.findElement(By.xpath("//SPAN[@class='RveJvd snByac'][text()='Next']")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
