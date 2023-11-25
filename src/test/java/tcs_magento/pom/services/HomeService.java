package tcs_magento.pom.services;

import org.openqa.selenium.By;

import tcs_magento.pom.DriverActions;
import tcs_magento.pom.pages.HomePage;

public class HomeService {
    private HomePage homePage;

    public HomeService() {
        this.homePage = new HomePage();
    }

    public void selectItem(String name) {
        DriverActions.click(this.homePage.get_lnk_item_by(name));
    }
}
