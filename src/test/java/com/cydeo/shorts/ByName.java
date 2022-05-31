package com.cydeo.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByName {

    public static void main(String[] args) throws InterruptedException {

        // Id, Name, LinkText, PartialLinkText, TagName, ClassName, CSS Selector, XPath

        //  Set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate.to(url)
        // driver.get(url)  ==> shorter way navigating
        driver.get("https://google.com");

         // If there is an "agree" requirements before reaching out the search page!!!
         // WebElement agreeButton=driver.findElement(By.className("QS5gu sy4vM"));
         // agreeButton.click();

        // identify and save the search box element
        WebElement searchBox = driver.findElement(By.name("q"));


        // enter text "selenium"
        searchBox.sendKeys("selenium");

        // click on the search button
        WebElement searchBtn = driver.findElement(By.name("btnK"));
        searchBtn.submit();

        Thread.sleep(5000);


        // close the browser
        driver.quit();

    }
}
