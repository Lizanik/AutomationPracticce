import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropdownPageTest extends FunctionalTest {
    DropdownPage dropdownPage = new DropdownPage(driver);

    @BeforeClass
    public void openBrowser() {
        driver.get("https://formy-project.herokuapp.com/dropdown");
    }

    @BeforeTest
    public void openDropdown() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getDropdown();
    }

    @Test
    public void verifyAutocomplete() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getAutocomplete();
        Assert.assertEquals("https://formy-project.herokuapp.com/autocomplete", dropdownPage.getUrl());
    }

    @Test
    public void verifyCheckbox() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getCheckbox();
        Assert.assertEquals("https://formy-project.herokuapp.com/checkbox", dropdownPage.getUrl());
    }

    @Test
    public void verifyDatepecker() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getDatepicker();
        Assert.assertEquals("https://formy-project.herokuapp.com/datepicker", dropdownPage.getUrl());
    }

    @Test
    public void verifyDragAndDrop() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getDragAndDrop();
        Assert.assertEquals("https://formy-project.herokuapp.com/dragdrop", dropdownPage.getUrl());
    }

    @Test
    public void verifyDropdown() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getDropdown1();
        Assert.assertEquals("https://formy-project.herokuapp.com/dropdown", dropdownPage.getUrl());
    }

    @Test
    public void verifyEnabledAndDisabledElements() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getEnabledAndDisabledElements();
        Assert.assertEquals("https://formy-project.herokuapp.com/enabled", dropdownPage.getUrl());
    }

    @Test
    public void verifyFileUpload() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getFileUpload();
        Assert.assertEquals("https://formy-project.herokuapp.com/fileupload", dropdownPage.getUrl());
    }

    @Test
    public void verifyFileDownload() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getFileDownload();
        Assert.assertEquals("https://formy-project.herokuapp.com/filedownload", dropdownPage.getUrl());
    }

    @Test
    public void verifyPageScroll() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getPageScroll();
        Assert.assertEquals("https://formy-project.herokuapp.com/scroll", dropdownPage.getUrl());
    }

    @Test
    public void verifyModal() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getModal();
        Assert.assertEquals("https://formy-project.herokuapp.com/modal", dropdownPage.getUrl());
    }

    @Test
    public void verifyRadioButton() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getRadioButton();
        Assert.assertEquals("https://formy-project.herokuapp.com/radiobutton", dropdownPage.getUrl());
    }

    @Test
    public void verifyKeyAndMousePressButton() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getKeyAndMousePressButton();
        Assert.assertEquals("https://formy-project.herokuapp.com/keypress", dropdownPage.getUrl());
    }

    @Test
    public void verifySwitchWindow() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getSwitchWindow();
        Assert.assertEquals("https://formy-project.herokuapp.com/switch-window", dropdownPage.getUrl());
    }

    @Test
    public void verifyCompleteWebForm() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getCompleteWebForm();
        Assert.assertEquals("https://formy-project.herokuapp.com/form", dropdownPage.getUrl());
    }
}
