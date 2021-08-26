package Pages;



import org.openqa.selenium.By;

import Hooks.TestNgHooks;

public class ViewLeadsPage extends TestNgHooks{
	
	public void verifyFirstName(String Fristname) {
		String fname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (fname.equals(Fristname)) {
			System.out.println("First name is verified");
		} else {
			System.out.println("Wrong name");

		}
	}
}
