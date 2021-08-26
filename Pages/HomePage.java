package Pages;

import org.openqa.selenium.By;

import Hooks.TestNgHooks;

public class HomePage extends TestNgHooks{
	
public LoginPage clickLogout() {
	driver.findElement(By.xpath("//input[@value =\"Logout\"]")).click();
	return new LoginPage();

}

public LeadsPage ClickcrmsfaLink() {
	driver.findElement(By.linkText("CRM/SFA")).click();
return new LeadsPage();
}
}
