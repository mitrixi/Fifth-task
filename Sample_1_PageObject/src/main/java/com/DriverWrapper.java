package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverWrapper {
    private final WebDriver driver;

    public DriverWrapper() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    public void init() {
        this.driver.get("https://itvdn.com/ru");
        this.driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void close() {
        this.driver.quit();
    }
}
