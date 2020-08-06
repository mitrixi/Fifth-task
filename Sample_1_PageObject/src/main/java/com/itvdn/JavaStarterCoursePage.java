package com.itvdn;

import org.openqa.selenium.WebDriver;

public class JavaStarterCoursePage {
    private final WebDriver driver;

    public JavaStarterCoursePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
