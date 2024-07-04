package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class googleSearchSteps {
    final static String cookieIdRefuse = "W0wltc";
    private WebDriver driver;

    @Before
    public void initializeDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @After
    public void afterMethod() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }

    @Given("^an open browser with google.com$")
    public void openGoogleSearch() {
        // Maximize browser window
        driver.manage().window().maximize();
        // Go to Google
        driver.get("http://www.google.com");
        driver.findElement(By.id(cookieIdRefuse)).click();
    }

    @When("^a keyword selenium is entered in input field$")
    public void keywordSeleniumIsEnteredInInputField() {
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Selenium");
        element.submit();
    }

    @Then("^the first one should contain \"(.*)\"$")
    public void theFirstOneShouldContainSelenium(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));
    }

}


