import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxPage extends PageObject{
    public CheckboxPage(WebDriver driver) {
        super(driver);
    }
        @FindBy(id = "checkbox-1")
        private WebElement checkbox1;

        @FindBy(id = "checkbox-2")
        private WebElement checkbox2;

        @FindBy(id = "checkbox-3")
        private WebElement checkbox3;

        public void setCheckbox1() {
            checkbox1.click();
            driver.navigate().refresh();
        }
        public void setCheckbox2() {
            checkbox2.click();
            driver.navigate().refresh();
        }
        public void setCheckbox3() {
            checkbox3.click();
            driver.navigate().refresh();

        }
}
