package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.TestNgHooks;

public class MyHomePage extends TestNgHooks{
	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
public LoginPage clickLogout() {
	driver.findElement(By.xpath("//input[@value =\"Logout\"]")).click();
	return new LoginPage(driver);

}
}
