package tcs_magento.pom;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverManager {

    private static WebDriver driver;
    private static Wait<WebDriver> wait;

    public static void create(String browser) {
        driver = WebDriverManager.getInstance(browser).create();
        driver.manage().window().maximize();
        wait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofSeconds(1))
                .withTimeout(Duration.ofSeconds(10))
                .ignoring(ElementClickInterceptedException.class);
        // wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static Wait<WebDriver> getWait() {
        return wait;
    }

    public static void goSite(String url) {
        driver.get(url);
    }
}
