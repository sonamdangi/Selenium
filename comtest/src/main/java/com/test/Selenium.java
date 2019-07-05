package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

  @Test
		public void Check()
        {
        System.setProperty("webdriver.chrome.driver","/var/lib/jenkins/chromedriver"); // <-- Change this path
        final ChromeOptions chromeOptions = new ChromeOptions();
	        chromeOptions.setBinary("/var/lib/jenkins/chromedriver");
	       chromeOptions.addArguments("--headless"); 
	        WebDriver driver = new ChromeDriver(chromeOptions);
	      
	        String baseUrl = "https://experitest.com/free-trial/";
	        String expectedTitle = "Free trial";
	        String actualTitle = "";
	        driver.get(baseUrl);
	        actualTitle = driver.getTitle();
	        Assert.assertEquals(expectedTitle, actualTitle);
	      
	        driver.close();
    }
}
