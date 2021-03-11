package com.courses;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.naming.Name;
import java.util.List;

public class FirstLesson {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get ("https://www.saucedemo.com");



        WebElement usernameField = driver.findElement (By.xpath("//input[@id='user-name']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[2]"));
        WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));


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
        List<WebElement> listOfOptions = select.getOptions();
        select.selectByValue("za");

        List<WebElement> listsecond = driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));
        WebElement addToCartsecond = listsecond.get(3);
        addToCartsecond.click();

        WebElement menu = driver.findElement(By.xpath("//button[@id ='react-burger-menu-btn']"));
        menu.click();

        WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
        WebDriverWait wait= new WebDriverWait(driver, 100000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='logout_sidebar_link']")));

        logout.click();
        driver.quit();


    }

}
