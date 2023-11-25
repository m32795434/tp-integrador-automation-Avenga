package tcs_magento.pom.pages;

import org.openqa.selenium.By;

public class CartPage {
    private String urlCartPage = "https://magento.softwaretestingboard.com/checkout/cart/";

    public By get_span_tocheckout_by() {
        return By.xpath("//span[contains(text(),'Proceed to Checkout')]");
    }

    public String getUrlCartPage() {
        return this.urlCartPage;
    }
}
