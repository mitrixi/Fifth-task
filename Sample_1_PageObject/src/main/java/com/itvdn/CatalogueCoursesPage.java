package com.itvdn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatalogueCoursesPage {
    private final WebDriver driver;

    public CatalogueCoursesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void openCertainCourse() {
        WebElement itvdniconVideoCatalogMenuItemIcon = driver.findElement(By.cssSelector(".itvdnicon-video-catalog.menu-item-icon"));
        itvdniconVideoCatalogMenuItemIcon.click();

        WebElement courseJavaStarter = driver.findElement(By.cssSelector("a[href='/ru/video/java-starter'] div"));
        courseJavaStarter.click();
    }
}
