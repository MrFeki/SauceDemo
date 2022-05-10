package tests_with_login;

import methods.LoggedInPageMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;


public class LogoutTest extends BaseTestWithLogin{


    @Test
    public void logout(){
        LoggedInPageMethods loggedInPageMethods = new LoggedInPageMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);
        loggedInPageMethods.logout();

        try {
            verificationPage.verifyLogout("Login");
            System.out.println("User is logged out");
        }catch(Exception e){
            Assert.fail("User is not logged out");
        }
    }
}
