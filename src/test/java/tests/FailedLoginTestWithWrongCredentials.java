package tests;

import methods.LoginPageMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class FailedLoginTestWithWrongCredentials extends BaseTest{

  @Test

  public void failedLogin(){
      LoginPageMethods loginPageMethods = new LoginPageMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loginPageMethods.login(PropertyManager.getInstance().getWrongUsername(),
                PropertyManager.getInstance().getWrongPassword());

        try {
            verificationPage.verifyFailedLogin("Epic sadface: Username and password do not match any user in this service") ;
            System.out.print("User is not logged in");
        }catch (Exception e){
            Assert.fail("User is logged in");
        }
    }

}
