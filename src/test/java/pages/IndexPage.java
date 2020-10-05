package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.Base;

public class IndexPage extends Base{

	//Index page
	
	public void goto_IndexPage() {
		try {
			driver.get("https://opensource-demo.orangehrmlive.com/");
			//assertEquals(driver.getTitle(), "OrangeHRM");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterUserName() {
		try {
			WebElement usrName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
			usrName.sendKeys("Admin");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	

}//closing class
