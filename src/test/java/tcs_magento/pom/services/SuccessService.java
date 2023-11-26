package tcs_magento.pom.services;

import tcs_magento.pom.DriverActions;
import tcs_magento.pom.pages.CartPage;
import tcs_magento.pom.pages.SuccessPage;

public class SuccessService {
    private SuccessPage successPage;

    public SuccessService() {
        this.successPage = new SuccessPage();
    }

    public String getThanksText() {
        return DriverActions.getText(this.successPage.get_span_thankyou_by());
    }

    public boolean isEnabledContinueShopping() {
        return DriverActions.isEnabled(this.successPage.get_lnk_continueshopping_by());
    }

    public boolean isVisibleCreateAndAccount() {
        return DriverActions.isVisible(this.successPage.get_lnk_createanaccount_by());
    }
}
