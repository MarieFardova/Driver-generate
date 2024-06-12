package com.course.selenium.TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BingSearch {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get("https://www.bing.com");
        WebElement element = driver.findElement(By.id("sb_form_q"));
        element.clear();
        element.sendKeys("Coderslab");
        element.submit();
        driver.quit();
    }

}