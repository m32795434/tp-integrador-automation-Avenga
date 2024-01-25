package tcs_magento.POM_PATTERN.services;

import tcs_magento.POM_PATTERN.DriverActions;
import tcs_magento.POM_PATTERN.pages.HomePage;

public class HomeService {
    private HomePage homePage;

    public HomeService() {
        this.homePage = new HomePage();
    }

    public void selectItem(String name) {
        DriverActions.click(this.homePage.get_lnk_item_by(name));
    }
}
