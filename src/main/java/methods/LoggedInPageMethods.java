package methods;

import org.openqa.selenium.WebDriver;
import pages.LoggedInPage;

public class LoggedInPageMethods extends LoggedInPage {
    public LoggedInPageMethods(WebDriver driver) {
        super(driver);
    }

    public void logout(){
        clickMenuButton();
        clickLogoutButton();
    }

    public void buyItem(String firstName, String lastName, String zipCode){
        clickAddToCartBackpack();
        clickShoppingCartButton();
        clickCheckOutButton();
        writeFirstName(firstName);
        writeLastName(lastName);
        writeZipCode(zipCode);
        clickContinueButton();
        clickFinishButton();
    }

    public void removeItem(){
        clickAddToCartBackpack();
        clickShoppingCartButton();
        clickRemoveButton();
        clickContinueShoppingButton();
    }
}

