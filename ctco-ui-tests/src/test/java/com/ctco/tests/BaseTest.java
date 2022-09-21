package com.ctco.tests;

import com.ctco.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.ctco.pages.CareersPage;
import com.ctco.pages.HomePage;
import com.ctco.pages.VacanciesPage;

public class BaseTest {
    public static final String URL = "https://ctco.lv/en";

    protected static WebDriver driver;
    protected static HomePage homePage;
    protected static CareersPage careersPage;
    protected static VacanciesPage vacanciesPage;

    @BeforeTest(alwaysRun = true)
    public void setUp() {
        driver = DriverSingleton.getDriver();
        driver.get(URL);
        homePage = PageFactory.initElements(driver, HomePage.class);
        careersPage = PageFactory.initElements(driver, CareersPage.class);
        vacanciesPage = PageFactory.initElements(driver, VacanciesPage.class);
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        DriverSingleton.closeDriver();
    }

}
