package linkedInCucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {
    WebDriver driver;

    @Given("^Open the Google Chrome and launch LinkedIn$")
    public void open_the_Google_Chrome_and_launch_LinkedIn() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\programs\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");
    }

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() throws Throwable {
        WebElement signInButton = driver.findElement(By.xpath("//a[@class='nav__button-secondary']"));
        signInButton.click();
        WebElement emailField = driver.findElement(By.xpath("//input[@id='username']"));
        emailField.sendKeys("liza.nik2015@gmail.com");
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        passwordField.sendKeys("hjdfvdf");
    }

    @Then("^Login to LinkedIn$")
    public void login_to_LinkedIn() throws Throwable {
        WebElement submitButton = driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']"));
        submitButton.click();
    }
}