package com.course.selenium.TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSearch {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // Point point = new Point(-1000, 0);
        // driver.manage().window().setPosition(point);
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.id("L2AGLb"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Coderslab");
        element.submit();
        // Thread.sleep(4000);
        driver.quit();
    }
}
