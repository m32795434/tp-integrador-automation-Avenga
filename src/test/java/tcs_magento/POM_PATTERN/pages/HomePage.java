package tcs_magento.POM_PATTERN.pages;

import org.openqa.selenium.By;

public class HomePage {
    private String urlHomePage = "https://magento.softwaretestingboard.com/";

    // Aplico este criterio👇, porque en la "Home", puede haber miles de productos,
    // y no sería conveniente (por esta página en particular) tener aquí miles de
    // variables dando vueltas😅.
    public By get_lnk_item_by(String name) {
        return By.xpath("//a[@title='" + name + "']");
    }

    public String getUrlHomePage() {
        return this.urlHomePage;
    }
}
