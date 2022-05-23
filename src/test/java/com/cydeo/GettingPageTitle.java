package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingPageTitle {

    public static void main(String[] args) throws InterruptedException {

        //  Set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // navigate.to(url)
        // driver.get(url)  ==> shorter way navigating
       driver.get("https://google.com");

       String pageTitle = driver.getTitle();
        System.out.println("pageTitle = " + pageTitle);

        if(pageTitle.equalsIgnoreCase("google")){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }

        Thread.sleep(5000);

        driver.quit();

    }

}
