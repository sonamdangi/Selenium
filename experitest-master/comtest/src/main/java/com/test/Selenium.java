package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/var/lib/jenkins/chromedriver"); // <-- Change this path
         // Add options to Google Chrome. The window-size is important for responsive sites
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
      //  options.addArguments("window-size=1200x600");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://seleniumhq.org");
        // a guarantee that the test was really executed
        assertTrue(driver.findElement(By.id("q")).isDisplayed());
      
        driver.quit();
    }
}
