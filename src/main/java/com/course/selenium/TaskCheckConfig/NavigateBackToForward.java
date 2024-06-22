package com.course.selenium.TaskCheckConfig;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NavigateBackToForward {
    public static void main(String[] args) throws InterruptedException {


            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            //Point point = new Point(-1000, 0);
            //driver.manage().window().setPosition(point);
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
            //Thread.sleep(3000);
            driver.navigate().to("https://coderslab.com/en");
            //Thread.sleep(3000);
            driver.navigate().back();
            //Thread.sleep(3000);
            driver.get("https://mystore-testlab.coderslab.pl/index.php");
            //Thread.sleep(3000);
            driver.navigate().back();
            //Thread.sleep(3000);
            driver.navigate().forward();
            //Thread.sleep(3000);
            driver.navigate().refresh();
            //Thread.sleep(3000);
            driver.quit();
    }
}

/*
navigate.back()
navigate.forward()
navigate.refresh()
Go to: https://www.google.com
Go to: https://coderslab.com/en
Go back to: https://www.google.com
Go to: https://mystore-testlab.coderslab.pl/index.php
Go back to: https://www.google.com
Go back to: https://mystore-testlab.coderslab.pl/index.php
Refresh the page: https://mystore-testlab.coderslab.pl/index.php
 */