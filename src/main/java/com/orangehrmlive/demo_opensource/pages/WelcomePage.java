package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class WelcomePage extends Utility {
    By welcomeText = By.xpath("//a[@id='welcome']");

    public String getWelcometext(){
        return getTextFromElement(welcomeText);

    }
}
