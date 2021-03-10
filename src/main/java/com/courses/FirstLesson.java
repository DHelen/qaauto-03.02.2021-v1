package com.courses;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.naming.Name;

public class FirstLesson {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get ("https://www.saucedemo.com");



        WebElement usernameField = driver.findElement (By.xpath("//input[@id='user-name']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[2]"));
        WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));

        WebElement name = driver.findElement(By.xpath("//div [@id='login_credentials']/text()[last()]"));
        WebElement pass = driver.findElement(By.xpath("//div [@class='login_password']/text()"));

        usernameField.sendKeys(name.getText());
        passwordField.sendKeys(pass.getText());
        loginbutton.click();



    }
}
