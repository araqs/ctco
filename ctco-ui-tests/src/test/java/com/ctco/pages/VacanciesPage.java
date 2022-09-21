package com.ctco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ctco.util.ILogger;

import java.util.List;

public class VacanciesPage extends BasePage {

    @FindBy(xpath = "//div[@class='table-row-display']//a[text()='TEST AUTOMATION ENGINEER']")
    private WebElement testAutomationEngineerVacancy;

    @FindBy(xpath = "//h1[text()='TEST AUTOMATION ENGINEER']//parent::div//ul[1]//li")
    private List<WebElement> professionalSkillsAndQualificationList;

    public VacanciesPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnTestAutomationEngineerVacancy() {
        click(testAutomationEngineerVacancy);
    }

    public int getProfessionalSkillsAndQualificationCount() {
        ILogger.info("Get professional skills and qualification count");
        return professionalSkillsAndQualificationList.size();
    }
}
