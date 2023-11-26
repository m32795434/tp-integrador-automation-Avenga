package tcs_magento.pom.pages;

import org.openqa.selenium.By;

public class SuccessPage {
    private String urlSuccessPage = "https://magento.softwaretestingboard.com/checkout/onepage/success/";

    public String getUrlSuccessPage() {
        return this.urlSuccessPage;
    }

    public By get_span_thankyou_by() {
        return By.xpath("//span[@class='base']");
    }

}