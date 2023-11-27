package tcs_magento.pom.services;

import tcs_magento.pom.DriverActions;
import tcs_magento.pom.pages.HomePage;
import tcs_magento.pom.pages.RadiantTeePage;

public class RadiantTeeService {

    private RadiantTeePage radiantTeePage;

    public RadiantTeeService() {
        this.radiantTeePage = new RadiantTeePage();
    }

    public void selectItemConfiguration(String size, String color, String qty) {
        if (size != null && size != "") {
            DriverActions.click(this.radiantTeePage.get_div_size_by(size));
        }
        if (color != null && color != "") {
            DriverActions.click(this.radiantTeePage.get_div_color_by(color));
        }
        if (qty != null && qty != "") {
            DriverActions.insertText(this.radiantTeePage.get_number_qty_by(), qty);
        }
    }

    // separé las funcionalidades addtoCart y goToCart, por si a futuro necesito
    // hacer un test sobre estas fucionalidades de forma aislada.
    public void addToCart() {
        DriverActions.click(this.radiantTeePage.get_btn_addtocart_by());
    }

    public void goToCart() {
        DriverActions.click(this.radiantTeePage.get_lnk_shoppingcart_by());
    }

    public boolean areVisibleRequiredWarnings() {
        return DriverActions.areVisible(this.radiantTeePage.get_divs_warningrequired_by());
    }
}
