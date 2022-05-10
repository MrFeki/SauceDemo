package tests_with_login;

import methods.LoggedInPageMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;


public class RemoveItemFromCartTest extends BaseTestWithLogin {

    @Test

    public void removeItem(){

        LoggedInPageMethods loggedInPageMethods = new LoggedInPageMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loggedInPageMethods.removeItem();

        try {
            verificationPage.verifyRemovedItem("ADD TO CART");
            System.out.println("Item is removed");
        }catch(Exception e){
            Assert.fail("Something went wrong...");
        }
    }
}
