package com.cydeo.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ById {

    public static void main(String[] args) throws InterruptedException {

   // Id, Name, LinkText, PartialLinkText, TagName, ClassName, CSS Selector, XPath

        //  Set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate.to(url)
        // driver.get(url)  ==> shorter way navigating
        driver.get("https://fr.yahoo.com/");

        WebElement agreeButton=driver.findElement(By.name("agree"));
        agreeButton.click();

        // identify and save the elements
        WebElement inputBox = driver.findElement(By.id("ybar-sbq"));

        // enter text "Hello"
        inputBox.sendKeys("Hello");

        // click on the search button
        WebElement searchBtn = driver.findElement(By.id("ybar-search"));
        searchBtn.click();

        String pageTitle = driver.getTitle();

        System.out.println("pageTitle = " + pageTitle);

        Thread.sleep(5000);

        driver.quit();


    }
}
