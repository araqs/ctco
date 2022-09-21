package com.ctco.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.ctco.util.ILogger;

public class TestAutomationEngineerSkillsAmountVerificationTest extends BaseTest {
    public static final int EXPECTED_SKILLS_AMOUNT = 8;

    @Test
    public void verifyTestAutomationEngineerSkillsAmount() {
        ILogger.info("Opening Careers menu");
        homePage.clickOnCareersMenu();

        ILogger.info("Clicking Vacancies from the list");
        careersPage.clickOnVacanciesSection();

        ILogger.info("Opening Test Automation Engineer vacancy");
        vacanciesPage.clickOnTestAutomationEngineerVacancy();

        ILogger.info("Verifying exact count of skills under Professional skills and qualification paragraph");
        Assert.assertEquals(vacanciesPage.getProfessionalSkillsAndQualificationCount(), EXPECTED_SKILLS_AMOUNT,
                "Skills count in Professional skills and qualification paragraph is not equal to " + EXPECTED_SKILLS_AMOUNT);
    }
}
