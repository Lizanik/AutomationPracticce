import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTask1 {
    public ChromeDriver driver;

    @BeforeTest
    public void Setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\programs\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void verifyButtonPrimary() {
        driver.get("https://formy-project.herokuapp.com/buttons#");
        WebElement Primary = driver.findElement(By.className("btn-primary"));
        Primary.click();
    }

    @Test(priority = 2)
    public void verifyButtonSuccess() {
        driver.get("https://formy-project.herokuapp.com/buttons#");
        WebElement Success = driver.findElement(By.className("btn-success"));
        Success.click();
    }

    @Test(priority = 3)
    public void verifyButtonInfo() {
        driver.get("https://formy-project.herokuapp.com/buttons#");
        WebElement Info = driver.findElement(By.className("btn-info"));
        Info.click();
    }

    @Test(priority = 4)
    public void verifyButtonWarning() {
        driver.get("https://formy-project.herokuapp.com/buttons#");
        WebElement Warning = driver.findElement(By.className("btn-warning"));
        Warning.click();
    }

    @Test(priority = 5)
    public void verifyButtonDanger() {
        driver.get("https://formy-project.herokuapp.com/buttons#");
        WebElement Danger = driver.findElement(By.className("btn-danger"));
        Danger.click();
    }

    @Test(priority = 6)
    public void verifyButtonLink() {
        driver.get("https://formy-project.herokuapp.com/buttons#");
        WebElement Link = driver.findElement(By.className("btn-link"));
        Link.click();
    }

    @Test(priority = 7)
    public void verifyButtonLeft() {
        driver.get("https://formy-project.herokuapp.com/buttons#");
        WebElement Left = driver.findElement(By.xpath("//button[text()='Left']"));
        Left.click();
    }

    @Test(priority = 8)
    public void verifyButtonMidle() {
        driver.get("https://formy-project.herokuapp.com/buttons#");
        WebElement Midle = driver.findElement(By.xpath("//button[text()='Middle']"));
        Midle.click();
    }

    @Test(priority = 9)
    public void verifyButtonRight() {
        driver.get("https://formy-project.herokuapp.com/buttons#");
        WebElement Right = driver.findElement(By.xpath("//button[text()='Right']"));
        Right.click();
    }

    @Test(priority = 10)
    public void verifyButtonNumber1() {
        driver.get("https://formy-project.herokuapp.com/buttons#");
        WebElement Number1 = driver.findElement(By.xpath("//button[text()='1']"));
        Number1.click();
    }

    @Test(priority = 11)
    public void verifyButtonNumber2() {
        driver.get("https://formy-project.herokuapp.com/buttons#");
        WebElement Number2 = driver.findElement(By.xpath("//button[text()='2']"));
        Number2.click();
    }

    @Test(priority = 13)
    public void verifyButtonDropDownLink1() {
        driver.get("https://formy-project.herokuapp.com/buttons#");
        driver.findElement(By.xpath("//button[@id='btnGroupDrop1']")).click();
        WebElement DropDownLink1 = driver.findElement(By.xpath("//a[contains(text(),'Dropdown link 1')] "));
        DropDownLink1.click();
    }
    @Test(priority = 14)
    public void verifyButtonDropDownLink2() {
        driver.get("https://formy-project.herokuapp.com/buttons#");
        driver.findElement(By.xpath("//button[@id='btnGroupDrop1']")).click();
        WebElement DropDownLink2 = driver.findElement(By.xpath("//a[contains(text(),'Dropdown link 2')] "));
        DropDownLink2.click();
        driver.close();
    }
}