package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/var/lib/jenkins/chromedriver"); // <-- Change this path
        ChromeOptions chromeOptions = new ChromeOptions();
        ChromeOptions.addArguments("--headless");
        String baseUrl = "https://experitest.com/free-trial/";
        String expectedTitle = "Free trial";
        String actualTitle = "";
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("TEST PASSED!");
        } else {
            System.out.println("TEST FAILED");
        }
        driver.close();
    }
}
