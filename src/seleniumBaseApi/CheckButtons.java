import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CheckButtons {
    public ChromeDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\programs\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/buttons#");
    }
    @AfterTest
    public void closeBrowser(){
        driver.close();
    }

    @Test(priority = 1)
    public void verifyButtonPrimary() {
        WebElement primaryButton = driver.findElement(By.className("btn-primary"));
        primaryButton.click();
    }

    @Test(priority = 2)
    public void verifyButtonSuccess() {
        WebElement successButton = driver.findElement(By.className("btn-success"));
        successButton.click();
    }

    @Test(priority = 3)
    public void verifyButtonInfo() {
        WebElement infoButton = driver.findElement(By.className("btn-info"));
        infoButton.click();
    }

    @Test(priority = 4)
    public void verifyButtonWarning() {
        WebElement warningButton = driver.findElement(By.className("btn-warning"));
        warningButton.click();
    }

    @Test(priority = 5)
    public void verifyButtonDanger() {
        WebElement dangerButton = driver.findElement(By.className("btn-danger"));
        dangerButton.click();
    }

    @Test(priority = 6)
    public void verifyButtonLink() {
        WebElement linkButton = driver.findElement(By.className("btn-link"));
        linkButton.click();
    }

    @Test(priority = 7)
    public void verifyButtonLeft() {
        WebElement leftButton = driver.findElement(By.xpath("//button[text()='Left']"));
        leftButton.click();
    }

    @Test(priority = 8)
    public void verifyButtonMiddle() {
        WebElement middleButton = driver.findElement(By.xpath("//button[text()='Middle']"));
        middleButton.click();
    }

    @Test(priority = 9)
    public void verifyButtonRight() {
        WebElement rightButton = driver.findElement(By.xpath("//button[text()='Right']"));
        rightButton.click();
    }

    @Test(priority = 10)
    public void verifyButtonNumber1() {
        WebElement number1 = driver.findElement(By.xpath("//button[text()='1']"));
        number1.click();
    }

    @Test(priority = 11)
    public void verifyButtonNumber2() {
        WebElement number2 = driver.findElement(By.xpath("//button[text()='2']"));
        number2.click();
    }

    @Test(priority = 13)
    public void verifyButtonDropdownLink1() {
        driver.findElement(By.xpath("//button[@id='btnGroupDrop1']")).click();
        WebElement dropdownLink1 = driver.findElement(By.xpath("//a[contains(text(),'Dropdown link 1')] "));
        dropdownLink1.click();
    }

    @Test(priority = 14)
    public void verifyButtonDropdownLink2() {
        driver.findElement(By.xpath("//button[@id='btnGroupDrop1']")).click();
        WebElement dropdownLink2 = driver.findElement(By.xpath("//a[contains(text(),'Dropdown link 2')] "));
        dropdownLink2.click();
    }
}