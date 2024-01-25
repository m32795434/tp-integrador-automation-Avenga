package tcs_magento.POM_PATTERN.services;

import tcs_magento.POM_PATTERN.DriverActions;
import tcs_magento.POM_PATTERN.pages.CartPage;

public class CartService {
    private CartPage cartPage;

    public CartService() {
        this.cartPage = new CartPage();
    }

    public void proceedToCheckOut() {
        DriverActions.click(this.cartPage.get_span_tocheckout_by());
    }
}
