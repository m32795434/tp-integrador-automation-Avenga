package tcs_magento.pom.pages;

import org.openqa.selenium.By;

public class RadiantTeePage {

    private String urlRadiantTeePage = "https://magento.softwaretestingboard.com/radiant-tee.html";

    public By get_div_size_by(String size) {
        return By.xpath("//div[@option-label='" + size + "']");
    }

    // public By get_divs_size_by(String size) {
    // return By.xpath("//div[starts-with(@id, 'option-label-size-')]");
    // }

    // buscar último elemento div hijo, en caso de que no se haya seleccionado
    // ninguna opción y estas opciones existan.
    // div[@class='swatch-attribute size']/div[last()]

    public By get_div_requiredwarning_by(String att) {
        return By.xpath("//div[@class='swatch-attribute " + att + "']/div[last()]");
    }

    public By get_div_color_by(String color) {
        return By.xpath("//div[@option-label='" + color + "']");
    }

    // public By get_divs_color_by(String size) {
    // return By.xpath("//div[starts-with(@id, 'option-label-color-')]");
    // }

    public By get_number_qty_by() {
        return By.id("qty");
    }

    public By get_btn_addtocart_by() {
        return By.id("product-addtocart-button");
    }

    public By get_lnk_shoppingcart_by() {
        return By.xpath("//a[contains(text(),'shopping cart')]");
    }

    // public By get_divs_warningrequired_by() {
    // return By.xpath("//div[starts-with(@id, 'super_attribute')]");
    // }

    public String getUrlRadiantTeePage() {
        return this.urlRadiantTeePage;
    }
}
