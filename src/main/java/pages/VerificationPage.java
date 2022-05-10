package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificationPage extends BasePage {
    public VerificationPage(WebDriver driver) {super(driver);}

    By productsBy = By.className("title");
    By loginButtonBy = By.id("login-button");
    By errorMessageBy = By.xpath("//h3[@data-test='error']");
    By checkoutMessageBy = By.className("title");
    By addToCartBackpack = By.id("add-to-cart-sauce-labs-backpack");

    public VerificationPage verifyFailedLogin(String expectedText){
        String error = readText(errorMessageBy);
        assertStringEquals(error,expectedText);
        return this;
    }
    public VerificationPage verifyLogout(String expectedText) {
        String loginButton = getAttributeText(loginButtonBy,"value");
        assertStringEquals(loginButton, expectedText);
        return this;
    }
    public VerificationPage verifyLogin (String expectedText){
           String products = readText(productsBy);
           assertStringEquals(products,expectedText);
           return this;
    }
    public VerificationPage verifyCheckout(String expectedText){
        String checkout = readText(checkoutMessageBy);
        assertStringEquals(checkout, expectedText);
        return this;
    }
    public VerificationPage verifyRemovedItem(String expectedText){
        String item = readText(addToCartBackpack);
        assertStringEquals(item,expectedText);
        return this;
    }

}
