package testpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginCheck {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    }

    @Test
    public void loginCheck() {

        driver.get("https://www.saucedemo.com");
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[2]"));
        WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));


        String textname = driver.findElement(By.id("login_credentials")).getText();
        String[] name = textname.split("\n");
        usernameField.sendKeys(name[1]);

        String textpass = driver.findElement(By.xpath("//div[@class='login_password']")).getText();
        String[] pass = textpass.split("\n");
        passwordField.sendKeys(pass[1]);

        loginbutton.click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }





    }
