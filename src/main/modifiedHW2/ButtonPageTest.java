import org.testng.annotations.Test;

public class ButtonPageTest extends FunctionalTest {
    @Test
    public void testButtonPage() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        ButtonsPage buttonsPage = new ButtonsPage(driver);
        buttonsPage.getPrimaryButton();
        buttonsPage.getSuccessButton();
        buttonsPage.getInfoButton();
        buttonsPage.getWarningButton();
        buttonsPage.getDangerButton();
        buttonsPage.getLinkButton();
        buttonsPage.getLeftButton();
        buttonsPage.getMiddleButton();
        buttonsPage.getRightButton();
        buttonsPage.getNumber1();
        buttonsPage.getNumber2();
        buttonsPage.getDropdown();
        buttonsPage.getDropdownLink1();
        buttonsPage.getDropdown();
        buttonsPage.getDropdownLink2();
    }
}