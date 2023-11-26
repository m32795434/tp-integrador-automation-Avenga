package tcs_magento.pom.pages;

import org.openqa.selenium.By;

public class ShippingPage {
    private String urlShippingPage = "https://magento.softwaretestingboard.com/checkout/#shipping";

    public String getUrlShippingPage() {
        return this.urlShippingPage;
    }

    public By get_email_by() {
        return By.xpath("//div[@class='control _with-tooltip']//input[@id='customer-email']");
    }

    public By get_text_first_by() {
        return By.xpath("//input[@name='firstname']");
    }

    public By get_text_last_by() {
        return By.xpath("//input[@name='lastname']");
    }

    public By get_text_street_by() {
        return By.xpath("//input[@name='street[0]']");
    }

    public By get_text_city_by() {
        return By.xpath("//input[@name='city']");
    }

    public By get_text_region_by() {
        return By.xpath("//input[@name='region']");
    }

    public By get_text_postal_by() {
        return By.xpath("//input[@name='postcode']");
    }

    public By get_option_country_by(String country) {
        return By.xpath("//option[@value='" + country + "']");
    }

    public By get_text_phone_by() {
        return By.xpath("//input[@name='telephone']");
    }

    public By get_radio_shippingmethod_by(String method) {
        return By.xpath("(//input[starts-with(@name, 'ko_unique_')])[" + method + "]");
    }

    public By get_button_next_by(String method) {
        return By.xpath("//button[@data-role='opc-continue']");
    }

}
