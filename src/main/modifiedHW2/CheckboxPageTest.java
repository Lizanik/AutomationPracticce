import org.testng.annotations.Test;

public class CheckboxPageTest extends FunctionalTest {
    @Test
    public void testCheckboxPage(){
        driver.get("https://formy-project.herokuapp.com/checkbox");
        CheckboxPage checkboxPage = new CheckboxPage(driver);
        checkboxPage.setCheckbox1();
        checkboxPage.setCheckbox2();
        checkboxPage.setCheckbox3();
    }
}
