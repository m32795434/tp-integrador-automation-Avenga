package tcs_magento.pom.pages;

import org.openqa.selenium.By;

public class ShippingPage {
    private String urlShippingPage = "https://magento.softwaretestingboard.com/checkout/#shipping";

    public By get_email_by() {
        return By.xpath("//div[@class='control _with-tooltip']//input[@id='customer-email']");
    }

    public By get_text_first_by() {
        return By.id("D837J3R");
    }

    public By get_text_last_by() {
        return By.id("N4YDMKN");
    }

    public By get_text_street_by() {
        return By.id("RU3C8UR");
    }

    public By get_text_city_by() {
        return By.id("BRY8N0Q");
    }

    public By get_text_postal_by() {
        return By.id("FY6J4FO");
    }

    public By get_option_country_by(String country) {
        return By.xpath("//option[@value='" + country + "']");
    }

    public String getUrlShippingPage() {
        return this.urlShippingPage;
    }
}
