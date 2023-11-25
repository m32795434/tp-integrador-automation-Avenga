package tcs_magento.pom;

import tcs_magento.pom.services.*;
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
    @Parameters({ "size", "color", "qty", "email", "first", "last", "street", "city", "postal", "country", "phone" })
    public void compraValida(String size, String color, String qty, String email, String first, String last,
            String street, String city, String postal, String country, String phone) {
        HomeService homeService = new HomeService();
        // Seleccionamos el ítem, y viajamos a la página del producto
        homeService.selectItem("Radiant Tee");
        RadiantTeeService radiantTeeService = new RadiantTeeService();
        radiantTeeService.selectItemConfiguration(size, color, qty);
        radiantTeeService.addToCart();
        radiantTeeService.goToCart();
        CartService cartService = new CartService();
        cartService.proceedToCheckOut();
        ShippingService shippingService = new ShippingService();
        shippingService.setRequiredShippingAddress(email, first, last, street, city, postal, country, phone);
    }
}
