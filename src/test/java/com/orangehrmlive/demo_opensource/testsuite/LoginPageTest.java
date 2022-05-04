package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.LoginPage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    @Test
    public void  UserShouldLoginSuccessfullyWithValidCredentials(){

        LoginPage loginPage = new LoginPage();
        loginPage.enterEmailId("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();

    }


}
