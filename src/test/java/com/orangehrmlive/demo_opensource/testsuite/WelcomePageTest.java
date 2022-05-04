package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.LoginPage;
import com.orangehrmlive.demo_opensource.pages.WelcomePage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WelcomePageTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    WelcomePage  welcomePage = new WelcomePage();

    @Test
    public void verifyWelcomeTextMessage() {
        LoginPage loginPage = new LoginPage();
        loginPage.enterEmailId("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();

        String expectedMessage = "Welcome Paul";
        String actualMessage = welcomePage.getWelcometext();
        Assert.assertEquals(expectedMessage, actualMessage, "Welcome message not displayed");


    }
}