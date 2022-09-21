package com.ctco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    @FindBy(xpath = "//a[text()='Careers']")
    private WebElement careersMenu;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnCareersMenu() {
        click(careersMenu);
    }
}
