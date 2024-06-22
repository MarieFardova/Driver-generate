package com.course.selenium.TaskCheckConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NavigateTo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        // Point point = new Point(-1000, 0);
        // driver.manage().window().setPosition(point);
        driver.manage().window().maximize();
        driver.get("https://coderslab.com/en");
        Thread.sleep(3000);//POČKÁ 3 SEKUNDY NEŽ NAVIGUJE NA DALŠÍ URL
        driver.navigate().to("https://mystore-testlab.coderslab.pl/index.php");
        Thread.sleep(3000);
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        Thread.sleep(3000);
        driver.quit();
    }
}

/*
Prepare a script that navigates between pages (we don't click any elements on these pages):

https://coderslab.com/en
https://mystore-testlab.coderslab.pl/index.php
https://hotel-testlab.coderslab.pl/en/
 */