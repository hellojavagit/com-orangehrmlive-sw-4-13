package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By emailField = By.id("txtUsername");
    By passwordField = By.id("txtPassword");
    By loginButton = By.xpath("//input[@id='btnLogin']");
    By forgotPasswordButton = By.xpath("//a[normalize-space()='Forgot your password?']");

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String clickOnForgotPasswordButton() {
       return getTextFromElement(forgotPasswordButton);
    }
}




