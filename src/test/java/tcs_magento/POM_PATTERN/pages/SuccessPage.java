package tcs_magento.POM_PATTERN.pages;

import org.openqa.selenium.By;

public class SuccessPage {
    private String urlSuccessPage = "https://magento.softwaretestingboard.com/checkout/onepage/success/";

    public String getUrlSuccessPage() {
        return this.urlSuccessPage;
    }

    public By get_span_thankyou_by() {
        return By.xpath("//span[@data-ui-id='page-title-wrapper']");
    }

    public By get_lnk_continueshopping_by() {
        return By.xpath("//a[@class='action primary continue']");
    }

    public By get_lnk_createanaccount_by() {
        return By.xpath("//a[@class='action primary']");
    }

    public By get_span_ordernumber_by() {
        return By.xpath("//div[@class='checkout-success']/p/span");
    }
}
