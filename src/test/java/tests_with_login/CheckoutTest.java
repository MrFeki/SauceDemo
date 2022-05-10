package tests_with_login;

import methods.LoggedInPageMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class CheckoutTest extends BaseTestWithLogin{

    @Test

    public void checkout(){

        LoggedInPageMethods loggedInPageMethods = new LoggedInPageMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);


        loggedInPageMethods.buyItem(PropertyManager.getInstance().getFirstName(),
                PropertyManager.getInstance().getLastName(), PropertyManager.getInstance().getZipCode());

        try {
            verificationPage.verifyCheckout("CHECKOUT: COMPLETE!");
            System.out.println("Item is bought");
        }catch(Exception e){
            Assert.fail("Something went wrong...");
        }
    }
}
