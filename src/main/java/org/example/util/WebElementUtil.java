package org.example.util;

import org.example.testbase.WebTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class WebElementUtil extends WebTestBase {

    public static void sendKeysToElements(WebElement element, String text) {
        element.sendKeys(text);
    }

    public static void clickOnElement(WebElement element) {
        element.click();
    }

    public static String getTextOfElement(WebElement element) {
        return element.getText();
    }

    public static boolean getElementDisplayed(WebElement element) {
        return element.isDisplayed();
    }
}
