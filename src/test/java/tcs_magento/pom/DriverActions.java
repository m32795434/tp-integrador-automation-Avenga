package tcs_magento.pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class DriverActions {
        public static void click(By locator) {
                DriverManager.getWait().until(
                                ExpectedConditions.elementToBeClickable(locator)).click();
                ;
        }

        public static void clickInterceptedButton(By locator) {
                WebDriver driver = DriverManager.getDriver();
                Wait<WebDriver> wait = new FluentWait<>(driver)
                                .pollingEvery(Duration.ofSeconds(1))
                                .withTimeout(Duration.ofSeconds(10))
                                .ignoring(ElementClickInterceptedException.class);
                DriverManager.setWait(wait);
                DriverManager.getWait().until(
                                ExpectedConditions.elementToBeClickable(locator)).click();
                wait = new FluentWait<>(driver)
                                .withTimeout(Duration.ofSeconds(10));
                DriverManager.setWait(wait);
        }

        public static void insertText(By locator, String text) {
                WebElement tempEl = DriverManager.getWait().until(
                                ExpectedConditions.visibilityOfElementLocated(locator));
                tempEl.clear();
                tempEl.sendKeys(text);
        }

        public static String sleepgGetText(By locator) {
                // El mensaje que tiene por defecto el span es "Checkout", NO "Thank you for
                // your purchase!", estimo es el mensaje "hardcodeado"...para checkear
                // correctamente el mensaje que
                // se muestra por pantalla (y no el hardcodeado), hay que forzar con un
                // Thread.sleep(2000) (mínimo) y esperar el contenido que viene del servidor
                try {
                        Thread.sleep(2000);
                } catch (Exception e) {
                        // TODO: handle exception
                }
                return DriverManager.getWait().until(
                                ExpectedConditions.visibilityOfElementLocated(locator)).getText();
        }

        public static String getText(By locator) {
                return DriverManager.getWait().until(
                                ExpectedConditions.visibilityOfElementLocated(locator)).getText();
        }

        public static WebElement getWebEl(By locator) {
                return DriverManager.getWait().until(
                                ExpectedConditions.visibilityOfElementLocated(locator));
        }

        public static Boolean isVisible(By locator) {
                return DriverManager.getWait().until(
                                ExpectedConditions.and(
                                                ExpectedConditions.visibilityOfElementLocated(locator)));
        }

        public static Boolean isEnabled(By locator) {
                return DriverManager.getWait().until(
                                ExpectedConditions.and(
                                                ExpectedConditions.elementToBeClickable(locator)));
        }

}
