package org.example.util;

import org.example.testbase.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ActionUtil extends WebTestBase {

    public static Actions actions;

    public static void moveToElement(WebElement element){
        actions = new Actions(driver);
        actions.moveToElement(element)
                .perform();
    }

    public static void dragAndDropToElement(WebElement srcElement, WebElement descElement){
        actions = new Actions(driver);
        actions.dragAndDrop(srcElement, descElement)
                .perform();
    }

    public static void bootstrapDropDown(List<WebElement> elementList, String text){
        for (WebElement element : elementList) {
            if (element.getText().equalsIgnoreCase(text)){
                element.click();
                break;
            }
        }
    }

}
