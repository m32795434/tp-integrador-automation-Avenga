package tcs_magento.pom.pages;

import org.openqa.selenium.By;

public class PaymentPage {
    private String urlPaymentPage = "https://magento.softwaretestingboard.com/checkout/#payment";

    public String getUrlPaymentPage() {
        return this.urlPaymentPage;
    }

    public By get_btn_placeorder_by() {
        return By.xpath("//button[@title='Place Order']");
    }
}
