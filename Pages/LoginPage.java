package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.TestNgHooks;

public class LoginPage extends TestNgHooks{
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public LoginPage typeUsername(String user) {
		driver.findElement(By.id("username")).sendKeys(user);
return this;
	}
	
	public LoginPage typePassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
		return this;

	}
	
	public HomePage clickLoginbutton() {
		driver.findElement(By.xpath("//input[@value = \"Login\"]")).click();
		return new HomePage(driver);

	}
	
}
