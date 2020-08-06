package com.itvdn;

import org.openqa.selenium.WebDriver;

public class StudyWithTrainerPage {
    private final WebDriver driver;

    public StudyWithTrainerPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
