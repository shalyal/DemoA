package script;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.DashBoardPage;
import page.LoginPage;

public class DemoA extends BaseTest {
	@Test(priority =1,groups= {"smoke"})
	public void TestA() {
		Reporter.log("Executing A",true);
		
		String un =Utility.getXLData(DATA_PATH, "DemoA", 1, 0);
		String pwd =Utility.getXLData(DATA_PATH, "DemoA", 1, 1);
		
		LoginPage l = new LoginPage(driver);
		l.setUserName(un);
		l.setPWD(pwd);
		l.loginclick();
		//verify that Dashboard page is displayed
		
		DashBoardPage d = new DashBoardPage(driver);
		d.clickWelcome();
		d.clickLogout(driver,10);
		//
		

	}

}
