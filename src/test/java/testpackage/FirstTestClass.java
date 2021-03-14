package testpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestClass {
    private WebDriver driver;
    private final static String LOGIN_CREDENTIALS_CLASS = "login_credentials";
    private final static String PASSWORD_CREDENTIALS_CLASS = "login_password";
    private final static int CORRECT_INDEX_FOR_LOGIN_AND_PASSWORD = 1;
    private final static int WRONG_USERNAME = 2;

    @BeforeMethod
    public void setup(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
}

    @Test
    public void firstTest(){

    driver.get ("https://www.saucedemo.com");
    }


    @Test
    public void secondTest(){
        driver.get ("https://www.google.com");
    }

    @AfterMethod
    public void tearDown() {
    driver.quit();
    }
}
