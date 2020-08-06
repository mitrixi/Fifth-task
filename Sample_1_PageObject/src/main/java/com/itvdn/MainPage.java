package com.itvdn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPage {

    final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(final String query) {
        driver.findElement(By.cssSelector("#search-on-top")).click();
        driver.findElement(By.cssSelector("#search-on-top")).sendKeys(query);
        driver.findElement(By.cssSelector("#search-on-top")).sendKeys(Keys.ENTER);
    }

    public void findInHomeSearchAndSelectJavaDeveloper() {
        driver.findElement(By.cssSelector("input#home-search")).sendKeys("Java");
        driver.findElement(By.cssSelector("a[data-index='1']")).click();
    }

    public void registrationUserAccount() {
        driver.findElement(By.cssSelector(".top-header .subscription-block a[href='/ru/account/register?jumpStart=true&returnUrl=/ru'")).click();
    }

    public void openPageWithCatalogCourses() {
        driver.findElement(By.cssSelector(".itvdnicon-video-catalog.menu-item-icon")).click();
    }

    public void openStudyingWithTrainer() {
        driver.findElement(By.cssSelector("li.desktop.menu-liveonline-item a div span.menu-icon-EduWithTrainer.menu-item-icon")).click();
        driver.findElement(By.xpath("//div[@class='dropdown-block lo-specialities']//span[text()='Java Developer']")).click();
    }
}
