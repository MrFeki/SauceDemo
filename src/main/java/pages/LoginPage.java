package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver) {super(driver);}

    By usernameFieldBy = By.id("user-name");
    By passwordFieldBy = By.id("password");
    By loginButtonBy = By.id("login-button");


    public void writeUsername (String username){
        writeText(usernameFieldBy,username);
    }
    public void writePassword (String password){
        writeText(passwordFieldBy, password);
    }
    public void clickLoginButton (){
        click(loginButtonBy);
    }
}
