package com.ctco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.ctco.util.ILogger;
import com.ctco.util.WaitHelper;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static com.ctco.driver.DriverSingleton.getDriver;

public class BasePage {
    public static WebDriver driver;
    public WaitHelper waitFor = new WaitHelper();

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }

    protected boolean isElementDisplayed(WebElement element) {
        ILogger.info("Checking if element is displayed");
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected void click(WebElement element) {
        waitFor().elementToBeVisible(element);
        ILogger.info("Element " + element.getText() + " is clicking..");
        element.click();
    }

    public WaitHelper waitFor() {
        waitFor.setDriver(getDriver());
        return waitFor;
    }
}
