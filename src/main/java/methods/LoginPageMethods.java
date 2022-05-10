package methods;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginPageMethods extends LoginPage {
    public LoginPageMethods(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password){
        writeUsername(username);
        writePassword(password);
        clickLoginButton();
    }
}
