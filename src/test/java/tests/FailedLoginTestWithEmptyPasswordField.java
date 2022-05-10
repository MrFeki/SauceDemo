package tests;

import methods.LoginPageMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class FailedLoginTestWithEmptyPasswordField extends BaseTest{

    @Test

    public void failedLogin(){
        LoginPageMethods loginPageMethods = new LoginPageMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loginPageMethods.login(PropertyManager.getInstance().getUsername(),
                PropertyManager.getInstance().getEmptyPassword());

        try {
            verificationPage.verifyFailedLogin("Epic sadface: Password is required");
            System.out.print("User is not logged in");
        }catch (Exception e){
            Assert.fail("User is logged in");
        }
    }

}

