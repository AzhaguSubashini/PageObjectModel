package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.TestNgHooks;

public class LeadsMenu extends TestNgHooks{
	public LeadsMenu(ChromeDriver driver) {
		this.driver = driver;
	}
	public CreateLeadsPage ClickCreateLeads() {
		driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLeadsPage(driver);
	}
}
