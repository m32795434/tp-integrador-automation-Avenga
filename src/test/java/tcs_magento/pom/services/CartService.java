package tcs_magento.pom.services;

import tcs_magento.pom.DriverActions;
import tcs_magento.pom.pages.CartPage;
import tcs_magento.pom.pages.HomePage;

public class CartService {
    private CartPage cartPage;

    public CartService() {
        this.cartPage = new CartPage();
    }

    public void proceedToCheckOut() {
        DriverActions.click(this.cartPage.get_span_tocheckout_by());
        // try
        // {
        // Thread.sleep(10000);
        // } catch (Exception e) {
        // // TODO: handle exception
        // }
    }
}
