import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CheckDropdown {
    public ChromeDriver driver;

    @DataProvider
    public Object[][] expectedURL() {
        return new Object[][]{
                {"https://formy-project.herokuapp.com/autocomplete"},
                {"https://formy-project.herokuapp.com/buttons"},
                {"https://formy-project.herokuapp.com/checkbox"},
                {"https://formy-project.herokuapp.com/datepicker"},
                {"https://formy-project.herokuapp.com/dragdrop"},
                {"https://formy-project.herokuapp.com/dropdown"},
                {"https://formy-project.herokuapp.com/enabled"},
                {"https://formy-project.herokuapp.com/fileupload"},
                {"https://formy-project.herokuapp.com/filedownload"},
                {"https://formy-project.herokuapp.com/keypress"},
                {"https://formy-project.herokuapp.com/modal"},
                {"https://formy-project.herokuapp.com/scroll"},
                {"https://formy-project.herokuapp.com/radiobutton"},
                {"https://formy-project.herokuapp.com/switch-window"},
                {"https://formy-project.herokuapp.com/form"}
        };
    }
    @BeforeClass
    public void setUp(String dataProvider) {
        System.setProperty("webdriver.chrome.driver", "C:\\programs\\chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");
    }
        @AfterClass
        public void closeBrowser() {
            driver.quit();

        }

    @Test (dataProvider = "expectedUrl")
    public void verifyUrl (String dataProvider) {
        driver.findElement(By.id("dropdownMenuButton")).click();
        WebElement links = driver.findElement(By.xpath("//a[@class='dropdown-item']"));
        for (int j = 0; j < 15; j++) {
            String currentURL = driver.getCurrentUrl();
            Assert.assertEquals(currentURL, dataProvider);
        }
    }
}




