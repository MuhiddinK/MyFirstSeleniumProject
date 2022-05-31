package com.cydeo.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagingBrowserWindow {

    public static void main(String[] args) {

        // Set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        // driver.get(url)   // shorter way navigating
        driver.get("https://google.com");

        // Maximize Browser Window
        driver.manage().window().maximize();

        // fullscreen
        //driver.manage().window().fullscreen();

        // Set the position of the windows // .getPosition()
        // driver.manage().window().setPosition( new Point(200, 0));


        // change the windows size
        // driver.manage().window().setSize(new Dimension(500, 600));

        // get the windows size
        System.out.println("driver.manage().window().getSize() = "+ driver.manage().window().getSize());


        driver.close();






    }
}
