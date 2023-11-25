package tcs_magento.pom.pages;

import org.openqa.selenium.By;

public class HomePage {
    private String urlHomePage = "https://magento.softwaretestingboard.com/";

    public By get_lnk_item_by(String name) {
        return By.xpath("//a[@title='" + name + "']");
    }

    public String getUrlHomePage() {
        return this.urlHomePage;
    }
}
