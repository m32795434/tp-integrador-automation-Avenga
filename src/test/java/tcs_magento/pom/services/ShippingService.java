package tcs_magento.pom.services;

import tcs_magento.pom.DriverActions;
import tcs_magento.pom.pages.HomePage;
import tcs_magento.pom.pages.ShippingPage;

public class ShippingService {
    private ShippingPage shippingPage;

    public ShippingService() {
        this.shippingPage = new ShippingPage();
    }

    // only required fields
    public void setRequiredShippingAddress(String email, String first, String last, String street, String city,
            String postal, String country, String phone) {
        DriverActions.insertText(this.shippingPage.get_email_by(), email);
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
