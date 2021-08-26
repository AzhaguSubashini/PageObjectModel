package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.TestNgHooks;

public class HomePage extends TestNgHooks{
	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
public LoginPage clickLogout() {
	driver.findElement(By.xpath("//input[@value =\"Logout\"]")).click();
	return new LoginPage(driver);

}

public LeadsPage ClickcrmsfaLink() {
	driver.findElement(By.linkText("CRM/SFA")).click();
return new LeadsPage(driver);
}
}
