package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.TestNgHooks;

public class LeadsPage extends TestNgHooks{
	
	public LeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public LeadsMenu ClickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	return new LeadsMenu(driver);
	}
}
