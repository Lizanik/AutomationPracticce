import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends PageObject {
    @FindBy(className = "btn-primary")
    private WebElement primaryButton;
    @FindBy(className = "btn-success")
    private WebElement successButton;
    @FindBy(className = "btn-info")
    private WebElement infoButton;
    @FindBy(className = "btn-warning")
    private WebElement warningButton;
    @FindBy(className = "btn-danger")
    private WebElement dangerButton;
    @FindBy(className = "btn-link")
    private WebElement linkButton;
    @FindBy(xpath = "//button[text()='Left']")
    private WebElement leftButton;
    @FindBy(xpath = "//button[(text()='Middle')]")
    private WebElement middleButton;
    @FindBy(xpath = "//button[(text()='Right')]")
    private WebElement rightButton;
    @FindBy(xpath = "//button[(text()='1')]")
    private WebElement number1;
    @FindBy(xpath = "//button[(text()='2')]")
    private WebElement number2;
    @FindBy(xpath = "//button[@id='btnGroupDrop1']")
    private WebElement dropdown;
    @FindBy(xpath = "//a[contains(text(),'Dropdown link 1')] ")
    private WebElement dropdownLink1;
    @FindBy(xpath = "//a[contains(text(),'Dropdown link 2')]")
    private WebElement dropdownLink2;

    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    public void getPrimaryButton() {
        primaryButton.click();
    }

    public void getSuccessButton() {
        successButton.click();
    }

    public void getInfoButton() {
        infoButton.click();
    }

    public void getWarningButton() {
        warningButton.click();
    }

    public void getDangerButton() {
        dangerButton.click();
    }

    public void getLinkButton() {
        linkButton.click();
    }

    public void getLeftButton() {
        leftButton.click();
    }

    public void getMiddleButton() {
        middleButton.click();
    }

    public void getRightButton() {
        rightButton.click();
    }

    public void getNumber1() {
        number1.click();
    }

    public void getNumber2() {
        number2.click();
    }

    public void getDropdown() {
        dropdown.click();
    }

    public void getDropdownLink1() {
        dropdownLink1.click();
    }

    public void getDropdownLink2() {
        dropdownLink2.click();
    }
}