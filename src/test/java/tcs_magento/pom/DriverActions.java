package tcs_magento.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DriverActions {
        public static void click(By element) {
                DriverManager.getWait().until(
                                ExpectedConditions.elementToBeClickable(element));

                DriverManager.getDriver().findElement(element).click();
        }

        public static void insertText(By element, String text) {
                WebElement tempEl;
                DriverManager.getWait().until(
                                ExpectedConditions.visibilityOfElementLocated(element));
                tempEl = DriverManager.getDriver().findElement(element);
                tempEl.clear();
                tempEl.sendKeys(text);
        }

        public static String getText(By element) {
                DriverManager.getWait().until(
                                ExpectedConditions.visibilityOfElementLocated(element));
                return DriverManager.getDriver().findElement(element).getText();
        }
        /* isEnabled, isSelected, isDisplayed already exist! */

}
