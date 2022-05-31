package com.cydeo.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkText {

    public static void main(String[] args) {

        // Set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        // navigate.to(url)
        // driver.get(url)   // shorter way navigating
        driver.get("https://yahoo.com");

        // click on the "J'accepte" button for Google
        //WebElement acceptBtn = driver.findElement(By.id("L2AGLb"));
        //acceptBtn.click();

        WebElement toutRefuse = driver.findElement(By.cssSelector("#consent-page > div > div > div > form > div.wizard-body > div.actions.couple > button.btn.secondary.reject-all"));
        toutRefuse.click();

        WebElement YahooSearchBox = driver.findElement(By.cssSelector("#ybar-sbq"));
        YahooSearchBox.sendKeys("scratch ");

        WebElement searchBtn = driver.findElement(By.cssSelector("#ybar-search"));
        searchBtn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        //driver.quit();
    }
}
