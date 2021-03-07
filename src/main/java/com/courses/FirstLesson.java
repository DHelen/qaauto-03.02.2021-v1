package com.courses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLesson {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get ("http://Google.com");
    }
}
