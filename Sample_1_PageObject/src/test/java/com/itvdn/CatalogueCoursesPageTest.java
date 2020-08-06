package com.itvdn;

import com.DriverWrapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatalogueCoursesPageTest {

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
    public void openCertainCourse() {
        new CatalogueCoursesPage(driverWrapper.getDriver()).openCertainCourse();
        JavaStarterCoursePage javaStarter = new JavaStarterCoursePage(driverWrapper.getDriver());

        assertEquals(javaStarter.getTitle(), "Видео курс Java Starter, уроки Java для начинающих - онлайн обучение ITVDN");
    }
}
