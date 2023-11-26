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
        DriverActions.click(this.paymentPage.get_btn_placeorder_by());
        try {
            Thread.sleep(100000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
