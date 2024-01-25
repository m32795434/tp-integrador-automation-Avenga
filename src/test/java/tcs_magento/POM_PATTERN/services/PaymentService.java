package tcs_magento.POM_PATTERN.services;

import tcs_magento.POM_PATTERN.DriverActions;
import tcs_magento.POM_PATTERN.pages.PaymentPage;

public class PaymentService {
    private PaymentPage paymentPage;

    public PaymentService() {
        this.paymentPage = new PaymentPage();
    }

    public void placeOrder() {
        DriverActions.clickInterceptedButton(this.paymentPage.get_btn_placeorder_by());
    }
}
