package com.cydeo.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingCurrentURL {

    public static void main(String[] args) throws InterruptedException {

        // Set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        // navigate.to(url)
        // driver.get(url)   // shorter way navigating
        driver.get("https://google.com");

        Thread.sleep(5000);

        System.out.println("driver.getCurrentUrl()= "+driver.getCurrentUrl());

        driver.quit();

    }

}
