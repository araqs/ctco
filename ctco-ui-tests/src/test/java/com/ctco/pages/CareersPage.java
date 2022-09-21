package com.ctco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersPage extends BasePage {

    @FindBy(xpath = "//div[@class='row show-desktop']//h1[text()='Vacancies']")
    private WebElement vacanciesSection;

    public CareersPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnVacanciesSection() {
        click(vacanciesSection);
    }
}
