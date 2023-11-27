package tcs_magento.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class DriverActions {
        public static void click(By locator) {
                DriverManager.getWait().until(
                                ExpectedConditions.elementToBeClickable(locator)).click();
                ;

                // DriverManager.getDriver().findElement(locator).click();
        }

        // public static void ignoringInterceptedClick(By locator) {
        // FluentWait<WebDriver> wait = new FluentWait<>(DriverManager.getDriver())
        // .withTimeout(Duration.ofSeconds(10))
        // .ignoring(ElementClickInterceptedException.class);

        // wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        // }

        // public static void clickVisibleBtn(By locator) {
        // DriverManager.getWait().until(
        // ExpectedConditions.visibilityOfElementLocated(locator));
        // DriverManager.getDriver().findElement(locator).click();
        // }

        public static void insertText(By locator, String text) {
                // WebElement tempEl;
                WebElement tempEl = DriverManager.getWait().until(
                                ExpectedConditions.visibilityOfElementLocated(locator));
                // tempEl = DriverManager.getDriver().findElement(locator);
                tempEl.clear();
                tempEl.sendKeys(text);
        }

        public static String getText(By locator) {
                return DriverManager.getWait().until(
                                ExpectedConditions.visibilityOfElementLocated(locator)).getText();
                // return DriverManager.getDriver().findElement(locator).getText();
        }

        public static Boolean isVisible(By element) {
                return DriverManager.getWait().until(
                                ExpectedConditions.and(
                                                ExpectedConditions.visibilityOfElementLocated(element)));
        }

        public static Boolean isEnabled(By element) {
                return DriverManager.getWait().until(
                                ExpectedConditions.and(
                                                ExpectedConditions.elementToBeClickable(element)));
        }

}
