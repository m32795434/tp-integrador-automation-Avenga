package tcs_magento.pom;

import tcs_magento.pom.services.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tcs_magento.pom.services.HomeService;

public class CompraItem {
    @BeforeMethod
    public void setup() {
        DriverManager.create("chrome");
        DriverManager.goSite("https://magento.softwaretestingboard.com/");
    }

    @Test
    @Parameters({ "name", "size", "color", "qty" })
    public void compraValida(String name, String size, String color, String qty) {
        HomeService homeService = new HomeService();
        homeService.selectItem(name, size, color, qty);
    }
}
