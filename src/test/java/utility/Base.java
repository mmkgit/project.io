package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
public static WebDriver driver;
	
	
	//Setup configuration Base class

	@BeforeClass
	public void setupClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}


	@AfterClass
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}
	

}
