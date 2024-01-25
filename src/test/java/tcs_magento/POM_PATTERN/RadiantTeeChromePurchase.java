package tcs_magento.POM_PATTERN;

import tcs_magento.POM_PATTERN.services.*;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RadiantTeeChromePurchase {
        @BeforeMethod
        public void setup() {
                DriverManager.create("chrome");
                DriverManager.goSite("https://magento.softwaretestingboard.com/");
        }

        @Test
        // validPurchase sirve para testear que la compra se complete correctamente SI
        // se ingresan todos los
        // campos requeridos tanto para la seleccion de la prenda, como para la
        // direccion de envío.
        // Válido para País: Argentina.
        // Al resto de los campos se les puede pasar cualquier valor (dentro de los que
        // el sistema pueda aceptar para una compra exitosa).
        @Parameters({ "size", "color", "qty", "email", "first", "last", "street", "city", "region", "postal", "country",
                        "phone",
                        "shipping_method" })
        public void validPurchase(String size, String color, String qty, String email, String first, String last,
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

                Assert.assertEquals(successService.getThanksText(), "Checkout",
                                "El mensaje de agradecimiento no es \"Checkout\"");
                Assert.assertTrue(successService.isEnabledContinueShopping(),
                                "El enlace \"Continue Shopping\"no está habilitado");
                Assert.assertTrue(successService.isVisibleCreateAndAccount(),
                                "El enlace \"Create an Account\"no está visible");
                Assert.assertTrue(successService.orderIsANumber(),
                                "No se obtuvo un número de orden, o el número de orden contiene caracteres");
        }

        // EXTRA!! 🥳--------------------------------------------
        // Con withoutRequiredAttributes(dependiendo de los parámetros) se puede
        // comprobar que si el
        // Usuario final NO rellena el campo
        // size y/O color, y dá click en "Add to cart", se
        // muestran los mensajes de advertencia "This is a required field." debajo del
        // campo/s que no se rellenó/rellenaron.
        @Test
        @Parameters({ "size", "color", "qty" })
        public void withoutRequiredAttributes(String size, String color, String qty) {
                HomeService homeService = new HomeService();
                // Select the item, and travel to the product's page
                homeService.selectItem("Radiant Tee");
                RadiantTeeService radiantTeeService = new RadiantTeeService();
                radiantTeeService.selectItemConfiguration(size, color, qty);
                radiantTeeService.addToCart();
                Map<String, WebElement> warningMap = radiantTeeService.getAllRequiredWarningsMap();

                // Assertions

                for (Map.Entry<String, WebElement> set : warningMap.entrySet()) {
                        Assert.assertEquals(set.getValue().getText(), "This is a required field.",
                                        "No se muestra por pantalla la advertencia esperada para el campo: "
                                                        + set.getKey());
                }
        }
}
