import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownPage extends PageObject {
    @FindBy(id = "dropdownMenuButton")
    private WebElement dropdown;
    @FindBy(id = "autocomplete")
    private WebElement autocompleteButton;
    @FindBy(xpath = "//a[text()='Buttons']")
    private WebElement buttonsButton;
    @FindBy(xpath = "//a[text()='Checkbox']")
    private WebElement checkboxButton;
    @FindBy(xpath = "//a[text()='Datepicker']")
    private WebElement datepickerButton;
    @FindBy(xpath = "//a[text()='Drag and Drop']")
    private WebElement dragAndDropButton;
    @FindBy(xpath = "//a[text()='Dropdown']")
    private WebElement dropdownButton;
    @FindBy(xpath = "//a[text()='Enabled and disabled elements']")
    private WebElement enabledAndDisabledElementsButton;
    @FindBy(xpath = "//a[text()='File Upload']")
    private WebElement fileUploadButton;
    @FindBy(xpath = "//a[text()='File Download']")
    private WebElement fileDownloadButton;
    @FindBy(xpath = "//a[text()='Key and Mouse Press']")
    private WebElement keyAndMousePressButton;
    @FindBy(xpath = "//a[text()='Modal']")
    private WebElement modalButton;
    @FindBy(xpath = "//a[text()='Page Scroll']")
    private WebElement pageScrollButton;
    @FindBy(xpath = "//a[text()='Radio Button']")
    private WebElement radioButton;
    @FindBy(xpath = "//a[text()='Switch Window']")
    private WebElement switchWindowButton;
    @FindBy(xpath = "//a[text()='Complete Web Form']")
    private WebElement completeWebFormButton;

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void getDropdown() {
        dropdown.click();
    }

    public void getAutocomplete() {
        autocompleteButton.click();
    }

    public String getUrl() {
        String url = driver.getCurrentUrl();
        return url;
    }

    public void getButtonsUrl() {
        buttonsButton.click();
    }

    public void getCheckbox() {
        checkboxButton.click();
    }

    public void getDatepicker() {
        datepickerButton.click();
    }

    public void getDragAndDrop() {
        dragAndDropButton.click();
    }

    public void getDropdown1() {
        dropdownButton.click();
    }

    public void getEnabledAndDisabledElements() {
        enabledAndDisabledElementsButton.click();
    }

    public void getFileUpload() {
        fileUploadButton.click();
        String urlFileUpload = driver.getCurrentUrl();
    }

    public void getFileDownload() {
        fileDownloadButton.click();
    }

    public void getPageScroll() {
        pageScrollButton.click();
    }

    public void getModal() {
        modalButton.click();
    }

    public void getRadioButton() {
        radioButton.click();
    }

    public void getKeyAndMousePressButton() {
        keyAndMousePressButton.click();
    }

    public void getSwitchWindow() {
        switchWindowButton.click();
    }

    public void getCompleteWebForm() {
        completeWebFormButton.click();
    }
}
