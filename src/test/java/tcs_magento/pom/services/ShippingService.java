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
            String region,
            String postal, String country, String phone) {
        DriverActions.click(this.shippingPage.get_option_country_by(country));
        DriverActions.insertText(this.shippingPage.get_email_by(), email);
        DriverActions.insertText(this.shippingPage.get_text_first_by(), first);
        DriverActions.insertText(this.shippingPage.get_text_last_by(), last);
        DriverActions.insertText(this.shippingPage.get_text_street_by(), street);
        DriverActions.insertText(this.shippingPage.get_text_city_by(), city);
        DriverActions.insertText(this.shippingPage.get_text_region_by(), region);
        DriverActions.insertText(this.shippingPage.get_text_postal_by(), postal);
        DriverActions.insertText(this.shippingPage.get_text_phone_by(), phone);
    }

    public void selectShippingMethod(String method) {
        DriverActions.click(this.shippingPage.get_radio_shippingmethod_by(method));

    }

    public void submitShippingForm() {
        DriverActions.click(this.shippingPage.get_button_next_by());
    }

}
