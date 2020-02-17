import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UiTestsCases {

    @Test
    public void verifyString() {
        System.setProperty("webdriver.chrome.driver", "C:\\programs\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.youtube.com/");
    }
}