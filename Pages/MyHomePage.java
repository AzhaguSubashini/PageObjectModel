package Pages;

import org.openqa.selenium.By;

import Hooks.TestNgHooks;

public class MyHomePage extends TestNgHooks{
	
public LoginPage clickLogout() {
	driver.findElement(By.xpath("//input[@value =\"Logout\"]")).click();
	return new LoginPage();

}
}
