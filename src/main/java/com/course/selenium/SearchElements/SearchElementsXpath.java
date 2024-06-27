package com.course.selenium.SearchElements;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchElementsXpath {

    private WebDriver driver;
    private WebDriverWait wait;

    private Helpers hlp;



    @Before()
    public void beforeMethod() {

        hlp = new Helpers();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }

    @After()
    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test()
    public void ex4SearchElementByXPath() throws InterruptedException {
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        Thread.sleep(3000);

        WebElement element = driver.findElement(By.className("user_login"));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();

        element = driver.findElement(By.className("account_input"));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys("test" + hlp.generateRandomString() + "@test.com");

        element = driver.findElement(By.xpath("//*[@id='SubmitCreate']"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

        element = driver.findElement(By.xpath("//*[@id='customer_firstname']"));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys("Name" + hlp.generateRandomLettersOnly(5));

        element = driver.findElement(By.xpath("//*[@id='customer_lastname']"));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys("SurName" + hlp.generateRandomLettersOnly(5));

        element = driver.findElement(By.xpath("//*[@id='passwd']"));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys("Pass123");

        Thread.sleep(3000);

        element = driver.findElement(By.xpath("//button[@id='submitAccount']//span[contains(.,'Register')]"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

        element = driver.findElement(By.xpath("//p[contains(@class,'alert-success') and contains(.,'Your account has been created')]"));
        wait.until(ExpectedConditions.visibilityOf(element));

        Assert.assertTrue("User not registered ...", element.getText().contains("Your account has been created"));
        Thread.sleep(3000);

        element = driver.findElement(By.cssSelector("a[title='Addresses'] span"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        Thread.sleep(5000);

    }

}
/*
SEARCH ELEMENTS:
(button) Sign In
(text field) Email address
After identifying the elements, click the Sign In button and enter any email address in the Email address field.
Start creating a new user by clicking the Create an account button
search for all required text fields using xpath locators, and fill them with any data:
First Name
Last Name
Email
Password
Click the Register button, which you will find using the By.xpath locator.
Identify the following fields using the By.cssSelector locator:
MY PERSONAL INFORMATION
MY ADDRESSES
 */