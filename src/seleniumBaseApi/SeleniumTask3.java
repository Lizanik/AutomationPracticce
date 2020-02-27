import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumTask3 {
    public ChromeDriver driver;

    @Test
    public void verifyString() {
        System.setProperty("webdriver.chrome.driver", "C:\\programs\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");
        int dropdownitems = driver.findElements(By.cssSelector(".dropdown-item")).size();
        for (int j = 1; j < dropdownitems; j++);
        WebElement dropdown = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
        dropdown.click();

    }
}




