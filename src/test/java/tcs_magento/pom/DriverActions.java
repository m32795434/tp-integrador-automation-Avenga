package tcs_magento.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DriverActions {
        public static void click(By locator) {
                DriverManager.getWait().until(
                                ExpectedConditions.elementToBeClickable(locator));

                DriverManager.getDriver().findElement(locator).click();
        }

        public static void insertText(By locator, String text) {
                WebElement tempEl;
                DriverManager.getWait().until(
                                ExpectedConditions.visibilityOfElementLocated(locator));
                tempEl = DriverManager.getDriver().findElement(locator);
                tempEl.clear();
                tempEl.sendKeys(text);
        }

        public static String getText(By locator) {
                DriverManager.getWait().until(
                                ExpectedConditions.visibilityOfElementLocated(locator));
                return DriverManager.getDriver().findElement(locator).getText();
        }
        /* isEnabled, isSelected, isDisplayed already exist! */

}
