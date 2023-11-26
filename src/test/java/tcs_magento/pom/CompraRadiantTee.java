package tcs_magento.pom;

import tcs_magento.pom.services.*;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CompraRadiantTee {
    @BeforeMethod
    public void setup() {
        DriverManager.create("chrome");
        DriverManager.goSite("https://magento.softwaretestingboard.com/");
    }

    @Test
    @Parameters({ "size", "color", "qty", "email", "first", "last", "street", "city", "region", "postal", "country",
            "phone",
            "shipping_method" })
    public void compraValida(String size, String color, String qty, String email, String first, String last,
            String street, String city, String region, String postal, String country, String phone,
            String shipping_method) {
        HomeService homeService = new HomeService();
        // Select the item, and travel to the product's page
        homeService.selectItem("Radiant Tee");
        RadiantTeeService radiantTeeService = new RadiantTeeService();
        radiantTeeService.selectItemConfiguration(size, color, qty);
        radiantTeeService.addToCart();
        radiantTeeService.goToCart();
        CartService cartService = new CartService();
        cartService.proceedToCheckOut();
        ShippingService shippingService = new ShippingService();
        shippingService.setRequiredShippingAddress(email, first, last, street, city,
                region, postal, country, phone);
        shippingService.selectShippingMethod(shipping_method);
        shippingService.submitShippingForm();
        PaymentService paymentService = new PaymentService();
        paymentService.placeOrder();
        // Assertions
        SuccessService successService = new SuccessService();
        Assert.assertEquals(successService.getThanksText(), "Thank you for purchase!",
                "El mensaje de agradecimiento no es \"Thank you for purchase!\"");
        Assert.assertTrue(successService.isEnabledContinueShopping(),
                "El enlace \"Continue Shopping\"no está habilitado");
        Assert.assertTrue(successService.isVisibleCreateAndAccount(),
                "El enlace \"Create an Account\"no está visible");
    }
}
