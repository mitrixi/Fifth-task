package com.itvdn;

import org.openqa.selenium.WebDriver;

public class RegistrationUserAccount {
    private final WebDriver driver;

    public RegistrationUserAccount(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

}
