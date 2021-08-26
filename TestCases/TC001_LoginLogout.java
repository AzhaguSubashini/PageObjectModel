package TestCases;

import org.testng.annotations.Test;

import Hooks.TestNgHooks;
import Pages.LoginPage;

public class TC001_LoginLogout extends TestNgHooks {
	
	@Test
	public void loginlogout() {
		
		new LoginPage()
		.typeUsername("demosalesmanager")
		.typePassword("crmsfa")
		.clickLoginbutton()
		.clickLogout();
		

	}

}
