package com.course.selenium.SearchElements;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SearchElementsEdgeBrowserTests {

    private WebDriver driver;
    private WebDriverWait wait;


    @Before()
    public void beforeMethod() {

        Helpers hlp = new Helpers();
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(options);
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
    public void ex1SearchElementById() throws InterruptedException {
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.id("hotel_location"));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys("Barcelona");
        //Thread.sleep(3000);

        element = driver.findElement(By.id("search_room_submit"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
       // Thread.sleep(3000);

        element = driver.findElement(By.id("newsletter-input"));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys("test@test.com");
    }

}

/*
On https://hotel-testlab.coderslab.pl/en/, identify the following fields/buttons using the By.id locator:
1/ (text field) Hotel Location
2/(button) Search Now
3/(text field) Enter your e-mail (field at the bottom of the page)
Once you have identified the elements, enter the following values into the text boxes:

Hotel Location - Barcelona
Enter your e-mail - test@test.com
Use the sendKeys method
 */