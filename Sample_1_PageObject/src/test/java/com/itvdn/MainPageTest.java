package com.itvdn;

import com.DriverWrapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainPageTest {

    private final DriverWrapper driverWrapper = new DriverWrapper();

    @BeforeEach
    void setUp() {
        driverWrapper.init();
    }

    @AfterEach
    void tearDown() {
        driverWrapper.close();
    }

    @Test
    void search() {
        MainPage mainPage = new MainPage(driverWrapper.getDriver());
        mainPage.search("QA");
        SearchPage searchPage = new SearchPage(driverWrapper.getDriver());
        List<WebElement> results = searchPage.getResults();
        assertEquals(10, results.size());
    }

    @Test
    public void findInHomeSearchAndSelectJavaDeveloper() {
        MainPage mainPage = new MainPage(driverWrapper.getDriver());
        mainPage.findInHomeSearchAndSelectJavaDeveloper();
        JavaDeveloperPage javaDeveloperPage = new JavaDeveloperPage(driverWrapper.getDriver());

        assertEquals(javaDeveloperPage.getTitle(), "Специальность Java developer, обязанности Java разработчиков");
    }

    @Test
    public void registrationUserAccount() {
        MainPage mainPage = new MainPage(driverWrapper.getDriver());
        mainPage.registrationUserAccount();
        RegistrationUserAccount registration = new RegistrationUserAccount(driverWrapper.getDriver());

        assertEquals(registration.getTitle(), "Регистрация учетной записи");
    }

    @Test
    public void openPageWithCatalogCourses() {
        new MainPage(driverWrapper.getDriver()).openPageWithCatalogCourses();
        CatalogueCoursesPage catalogue = new CatalogueCoursesPage(driverWrapper.getDriver());

        assertEquals(catalogue.getTitle(), "Курсы программирования: каталог курсов по сложности, стоимости и авторству");
    }

    @Test
    public void openStudyingWithTrainer() {
        new MainPage(driverWrapper.getDriver()).openStudyingWithTrainer();
        StudyWithTrainerPage studyWithTrainer = new StudyWithTrainerPage(driverWrapper.getDriver());
        
        assertEquals(studyWithTrainer.getTitle(), "Java Developer - Online обучение на ITVDN");
    }
}