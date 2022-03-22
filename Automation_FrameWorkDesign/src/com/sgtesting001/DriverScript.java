package com.sgtesting001;

import com.sgtestinglevel1.HomePage;
import com.sgtestinglevel1.Initialize;
import com.sgtestinglevel1.LoginLogout;
import com.sgtestinglevel1.Users;

public class DriverScript {

	public static void main(String[] args) {

		try
		{
			//Create User Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			HomePage.minimizeFlyOutWindow();
			Users.createUser();
			Users.deleteUser();
			LoginLogout.logout();
			Initialize.closeApplication();

			//Modify User Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			HomePage.minimizeFlyOutWindow();
			Users.createUser();
			Users.modifyUser();
			Users.deleteUser();
			LoginLogout.logout();
			Initialize.closeApplication();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
