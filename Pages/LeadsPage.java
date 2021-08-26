package Pages;

import org.openqa.selenium.By;

import Hooks.TestNgHooks;

public class LeadsPage extends TestNgHooks{
	
	public LeadsMenu ClickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	return new LeadsMenu();
	}
}
