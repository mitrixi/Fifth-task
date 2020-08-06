package com.itvdn;

import org.openqa.selenium.WebDriver;

public class JavaDeveloperPage {
    final WebDriver driver;

    public JavaDeveloperPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
