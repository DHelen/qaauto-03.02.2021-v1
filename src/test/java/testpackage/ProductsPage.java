package testpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ProductsPage {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    }

    @Test
    public void productsTest(){

        driver.get ("https://www.saucedemo.com");
        WebElement usernameField = driver.findElement (By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginbutton = driver.findElement(By.id("login-button"));


        String textname = driver.findElement(By.id("login_credentials")).getText();
        String [] name = textname.split("\n");
        usernameField.sendKeys(name [1]);

        String textpass = driver.findElement(By.xpath("//div[@class='login_password']")).getText();
        String [] pass = textpass.split("\n");
        passwordField.sendKeys( pass [1]);

        loginbutton.click();

        List<WebElement> list = driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));
        WebElement addToCart = list.get(2);
        addToCart.click();

        WebElement filter = driver.findElement(By.xpath("//select[@class ='product_sort_container']" ));
        Select select = new Select(filter);
        select.selectByValue("za");

        List<WebElement> secondList = driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));
        WebElement addToCartSecond = secondList.get(3);
        addToCartSecond.click();

        WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
        menu.click();

        WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
        WebDriverWait wait= new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));

        logout.click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }







}
