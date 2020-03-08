import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebFormPage extends PageObject {
    private WebDriver driver;
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastNameField;
    @FindBy(xpath = "//input[@id='job-title']")
    private WebElement jobTitleField;
    @FindBy(xpath = "//input[@id='radio-button-1']")
    private WebElement radioButton1;
    @FindBy(xpath = "//input[@id='radio-button-2']")
    private WebElement radioButton2;
    @FindBy(xpath = "//input[@id='radio-button-3']")
    private WebElement radioButton3;
    @FindBy(xpath = "//input[@id='checkbox-1']")
    private WebElement checkBox1;
    @FindBy(xpath = "//input[@id='checkbox-2']")
    private WebElement checkBox2;
    @FindBy(xpath = "//input[@id='checkbox-3']")
    private WebElement checkBox3;
    @FindBy(xpath = "//select[@id='select-menu']")
    private WebElement yearsOfExperience;
    @FindBy(xpath = "//input[@id='datepicker']")
    private WebElement datepicker;
    @FindBy(xpath = "//a[@class='btn btn-lg btn-primary']")
    private WebElement submitButton;
    @FindBy(xpath = "//select[@class='form-control']//option[@value='1']")
    private WebElement yearOfExperience0_1;
    @FindBy(xpath = "//select[@class='form-control']//option[@value='2']")
    private WebElement yearOfExperience2_4;
    @FindBy(xpath = "//select[@class='form-control']//option[@value='3']")
    private WebElement yearOfExperience5_9;
    @FindBy(xpath = "//select[@class='form-control']//option[@value='4']")
    private WebElement yearOfExperience10;

    public WebFormPage(WebDriver driver) {
        super(driver);
    }

    public void setFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void setJobTitle(String jobTitle) {
        jobTitleField.sendKeys(jobTitle);
    }

    public void setRadioButton1() {
        radioButton1.click();
    }

    public void setRadioButton2() {
        radioButton2.click();
    }

    public void setRadioButton3() {
        radioButton3.click();
    }

    public void setCheckBox1() {
        checkBox1.click();
    }

    public void setCheckBox2() {
        checkBox2.click();
    }

    public void setCheckBox3() {
        checkBox3.click();
    }

    public void setYearsOfExperience0_1() {
        yearsOfExperience.click();
        yearOfExperience0_1.click();
    }

    public void setYearsOfExperience2_4() {
        yearsOfExperience.click();
        yearOfExperience2_4.click();
    }

    public void setYearsOfExperience5_9() {
        yearsOfExperience.click();
        yearOfExperience5_9.click();
    }

    public void setYearsOfExperience10() {
        yearsOfExperience.click();
        yearOfExperience10.click();
    }

    public void setDatepicker(String date) {
        datepicker.sendKeys(date);
    }

    public ThanksForSubmitPage clickSubmitButton() {
        submitButton.click();
        return new ThanksForSubmitPage(driver);
    }

    public void enterInfo(String firstName, String lastName, String jobTitle) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setJobTitle(jobTitle);
    }

    public void enterDate(String date) {
        this.setDatepicker(date);
    }
}