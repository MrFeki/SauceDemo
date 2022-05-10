package tests_with_login;

import io.github.bonigarcia.wdm.WebDriverManager;
import methods.LoginPageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.PropertyManager;

public class BaseTestWithLogin {
    protected WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();



        driver = new ChromeDriver(new ChromeOptions().addArguments("--disable-notifications")
                .addArguments("--start-maximized"));


       /* WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver(new FirefoxOptions().addArguments("--disable-notifications").addArguments("--start-maximized"));
*/
        driver.get(PropertyManager.getInstance().getUrl());

        LoginPageMethods loginPageMethods = new LoginPageMethods(driver);
        loginPageMethods.login(PropertyManager.getInstance().getUsername(),
                PropertyManager.getInstance().getPassword());
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
