package Pages;

import org.openqa.selenium.By;

import Hooks.TestNgHooks;

public class LeadsMenu extends TestNgHooks{
	
	public CreateLeadsPage ClickCreateLeads() {
		driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLeadsPage();
	}
}
