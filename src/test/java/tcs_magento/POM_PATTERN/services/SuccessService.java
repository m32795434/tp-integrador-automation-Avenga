package tcs_magento.POM_PATTERN.services;

import tcs_magento.POM_PATTERN.DriverActions;
import tcs_magento.POM_PATTERN.pages.SuccessPage;

public class SuccessService {
    private SuccessPage successPage;

    public SuccessService() {
        this.successPage = new SuccessPage();
    }

    public String getThanksText() {
        return DriverActions.sleepgGetText(this.successPage.get_span_thankyou_by());
    }

    public boolean isEnabledContinueShopping() {
        return DriverActions.isEnabled(this.successPage.get_lnk_continueshopping_by());
    }

    public boolean isVisibleCreateAndAccount() {
        return DriverActions.isVisible(this.successPage.get_lnk_createanaccount_by());
    }

    public boolean orderIsANumber() {
        String orderText = DriverActions.getText(this.successPage.get_span_ordernumber_by());
        try {
            Integer.parseInt(orderText);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
