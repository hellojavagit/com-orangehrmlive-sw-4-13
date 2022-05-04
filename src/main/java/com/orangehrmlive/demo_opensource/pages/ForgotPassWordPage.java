package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPassWordPage extends Utility {

    By forgottenPasswordLink = By.xpath("//a[@href='/index.php/auth/requestPasswordResetCode']");
    By forgottenMessage = By.xpath("//h1[contains(text(),'Forgot Your Password?')]");


    public void clickOnForgottenPasswordLink() {
        clickOnElement(forgottenPasswordLink);
    }

        public String getForgottenMessage() {
            return getTextFromElement(forgottenMessage);
        }
    }

