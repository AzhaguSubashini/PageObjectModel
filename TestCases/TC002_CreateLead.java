package TestCases;


import org.testng.annotations.Test;

import Hooks.TestNgHooks;
import Pages.LoginPage;

public class TC002_CreateLead extends TestNgHooks{

	@Test
	public void createLead() {
		new LoginPage(driver)
		.typeUsername("demosalesmanager")
		.typePassword("crmsfa")
		.clickLoginbutton()
		.ClickcrmsfaLink()
		.ClickLeads()
		.ClickCreateLeads()
		.typeCompanyName("BNP")
		.typeFirstname("Azhagu")
		.typeLastname("Subashini")
		.typePhoneNumber("45678")
		.clickCreateButton()
		.verifyFirstName("Azhagu");
	}
}
