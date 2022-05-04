package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.LoginPage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgottenPasswordTest extends TestBase {


    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        LoginPage loginPage = new LoginPage();
        loginPage.clickOnForgotPasswordButton();

        String expectedForgottenMessage = "Forgot your password?";
        String actualForgottenMessage = loginPage.clickOnForgotPasswordButton();
        Assert.assertEquals(expectedForgottenMessage,actualForgottenMessage,"Forgot Your Password? Message Not Displayed correctly");
    }

}
