package tcs_magento.pom.pages;

import org.openqa.selenium.By;

public class RadiantTeePage {

    private String urlRadiantTeePage = "https://magento.softwaretestingboard.com/radiant-tee.html";

    public By get_div_size_by(String size) {
        return By.xpath("//div[@option-label='" + size + "']");
    }

    public By get_div_color_by(String color) {
        return By.xpath("//div[@option-label='" + color + "']");
    }

    public By get_number_qty_by() {
        return By.id("qty");
    }

    public By get_btn_addtocart_by() {
        return By.id("product-addtocart-button");
    }

    public String getUrlRadiantTeePage() {
        return this.urlRadiantTeePage;
    }
}
