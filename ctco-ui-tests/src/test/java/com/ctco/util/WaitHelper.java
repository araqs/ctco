package com.ctco.util;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
    private int timeout = 90;

    private WebDriver webDriver;

    public void setDriver(WebDriver driver) {
        webDriver = driver;
    }

    public void elementToBeVisible(WebElement element) {
        try {
            new WebDriverWait(webDriver, timeout, 10L).until(ExpectedConditions.visibilityOf(element));
        } catch (WebDriverException e) {
            ILogger.error(e.getMessage(), e);
            throw new WebDriverException("Element is not visible");
        }
    }
}