package Pages;

import org.openqa.selenium.By;

import Hooks.TestNgHooks;

public class CreateLeadsPage extends TestNgHooks{
	
	public CreateLeadsPage typeCompanyName(String cname) {
		driver.findElement(By.xpath("(//input[@name =\"companyName\"])[2]")).sendKeys(cname);
		return this;

	}
	
	public CreateLeadsPage typeFirstname(String fname) {
		driver.findElement(By.xpath("(//input[@name =\"firstName\"])[3]")).sendKeys(fname);
		return this;

	}
	public CreateLeadsPage typeLastname(String lname) {
		driver.findElement(By.xpath("(//input[@name =\"lastName\"])[3]")).sendKeys(lname);
		return this;

	}
	
	public CreateLeadsPage typePhoneNumber(String phno) {
		//(//input[@name ="primaryPhoneNumber"])[4]
		driver.findElement(By.xpath("(//input[@name =\"primaryPhoneNumber\"])[4]")).sendKeys(phno);
		return this;
	}
	public ViewLeadsPage clickCreateButton() {
		////input[@value="Create Lead"]
		driver.findElement(By.xpath("//input[@value=\"Create Lead\"]")).click();;
		return new ViewLeadsPage();
	}
}
