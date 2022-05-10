package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoggedInPage extends BasePage{
    public LoggedInPage(WebDriver driver) {
        super(driver);
    }

    By menuButtonBy = By.id("react-burger-menu-btn");
    By logoutButtonBy = By.id("logout_sidebar_link");
    By addToCartBackpack = By.id("add-to-cart-sauce-labs-backpack");
    By shoppingCart = By.id("shopping_cart_container");
    By checkOutButtonBy = By.id("checkout");
    By firstNameFieldBy =By.id("first-name");
    By lastNameFieldBy = By.id("last-name");
    By zipCodeBy = By.id("postal-code");
    By continueButtonBy = By.id("continue");
    By finishButtonBy = By.id("finish");
    By removeButtonBy = By.id("remove-sauce-labs-backpack");
    By continueShoppingButtonBy = By.id("continue-shopping");

    public void clickMenuButton(){
        click(menuButtonBy);
    }
    public void clickLogoutButton(){
        click(logoutButtonBy);
    }
    public void clickAddToCartBackpack(){click(addToCartBackpack);}
    public void clickShoppingCartButton(){click(shoppingCart);}
    public void clickCheckOutButton(){click(checkOutButtonBy);}
    public void writeFirstName(String text){writeText(firstNameFieldBy,text);}
    public void writeLastName(String text){writeText(lastNameFieldBy, text);}
    public void writeZipCode(String text){writeText(zipCodeBy,text);}
    public void clickContinueButton(){click(continueButtonBy);}
    public void clickFinishButton(){click(finishButtonBy);}
    public void clickRemoveButton(){click(removeButtonBy);}
    public void clickContinueShoppingButton(){click(continueShoppingButtonBy);}
}
