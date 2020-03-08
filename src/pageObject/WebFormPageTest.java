import org.testng.annotations.Test;

public class WebFormPageTest extends FunctionalTest {

    @Test
    public static void fillInfo() {
        driver.get("https://formy-project.herokuapp.com/form");
        WebFormPage webFormPage = new WebFormPage(driver);
        webFormPage.enterInfo("Katya", "Komorova", "Architect");
        webFormPage.setRadioButton2();
        webFormPage.setCheckBox2();
        webFormPage.setYearsOfExperience5_9();
        webFormPage.setDatepicker("03.98.2000");
        webFormPage.clickSubmitButton();
    }
}
