import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.util.concurrent.TimeUnit;

public class FunctionalTest {
    protected static ChromeDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\programs\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @AfterClass
    public static void tearDown() {
        driver.close();
    }
}
