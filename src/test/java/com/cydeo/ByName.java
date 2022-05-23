package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByName {

    public static void main(String[] args) {

        // Id, Name, LinkText, PartialLinkText, TagName, ClassName, CSS Selector, XPath

        //  Set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // navigate.to(url)
        // driver.get(url)  ==> shorter way navigating
        driver.get("https://fr.yahoo.com/");

        WebElement agreeButton=driver.findElement(By.name("agree"));
        agreeButton.click();



        driver.quit();

    }
}
