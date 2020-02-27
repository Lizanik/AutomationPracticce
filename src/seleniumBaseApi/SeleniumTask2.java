import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumTask2 {
    public ChromeDriver driver;

    @BeforeTest
    public void Setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\programs\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterTest
    public void closeDriver() {
        driver.quit();
    }
    @DataProvider(name = "data-providerCSS")
    public Object[][] cssDataProvider() {
        return new Object[][]{
                {"#checkbox-1"},
                {"#checkbox-2"},
                {"#checkbox-3"},
        };
    }

    @DataProvider(name = "data-providerXPATH")
    public Object[][] XpathDataProvider() {
        return new Object[][]{
                {"//input[(@id='checkbox-1')]"},
                {"//input[(@id='checkbox-2')]"},
                {"//input[(@id='checkbox-3')]"},
        };
    }

    @Test(dataProvider = "data-providerCSS")
    public void CheckBoxTestCSS(String dataProvider) {
        driver.get("https://formy-project.herokuapp.com/checkbox");
        driver.findElement(By.cssSelector(dataProvider)).click();
    }

    @Test(dataProvider = "data-providerXPATH")
    public void CheckBoxTestXPATH(String dataProvider) {
        driver.get("https://formy-project.herokuapp.com/checkbox");
        driver.findElement(By.xpath(dataProvider)).click();
    }
}