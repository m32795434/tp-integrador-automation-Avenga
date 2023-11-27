package tcs_magento.pom.services;

import tcs_magento.pom.DriverActions;
import tcs_magento.pom.pages.CartPage;
import tcs_magento.pom.pages.PaymentPage;

public class PaymentService {
    private PaymentPage paymentPage;

    public PaymentService() {
        this.paymentPage = new PaymentPage();
    }

    public void placeOrder() {
        // I had to check only with visibilityOfElementLocated because the button didn't
        // passed the elementToBeClickable check

        DriverActions.click(this.paymentPage.get_btn_placeorder_by());
    }
}
