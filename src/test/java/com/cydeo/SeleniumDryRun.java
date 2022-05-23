package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDryRun {

    public static void main(String[] args) {

        // 1. set up chrome driver
        WebDriverManager.firefoxdriver().setup();

        // 2. Create WebDriver instance that point to chrome driver
        WebDriver driver = new FirefoxDriver();

        // 3. Navigate to https://google.com in Chrome
        driver.navigate().to("https://google.com");



        // 1. set up Firefox driver
       // WebDriverManager.chromedriver().setup();

        // 2. Create WebDriver instance that point to Firefox driver
       // WebDriver driver = new ChromeDriver();

        // 3. Navigate to https://google.com in Firefox
      //  driver.navigate().to("https://google.com");

        driver.close();


    }
}
