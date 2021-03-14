package testpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homework3 {
    private WebDriver driver;
    private WebElement usernameField;
    private WebElement passwordField;
    private WebElement loginButton;
    private String correctLogin;
    private String wrongLogin;
    private String password;

    public Homework3() {


        @BeforeMethod
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com");
        }

        @Test
public void homework3(){
            WebElement usernameField = driver.findElement (By.id("user-name"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginbutton = driver.findElement(By.id("login-button"));
            loginbutton.click();
            WebElement error = driver.findElement(By.xpath("//h3"));

            If (error.getText().contains("Username is required")) {


            }



        }









        @AfterMethod
        public void tearDown() {
            driver.quit();
        }
    }

}
