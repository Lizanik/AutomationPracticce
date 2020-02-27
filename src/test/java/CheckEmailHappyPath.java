import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {
    @DataProvider
    public Object[][] validEmail() {
        return new Object[][]{
                {"kateryna@gmail.com"},
                {"kateryna23@gmail.com"},
                {"roman25@gmail.com"},
                {"roman!67@gmail.com"},
                {"roman_55@mail.ru"},
                {"roman@roman.com"},
                {"_roman45@ukr.net"}
        };
    }

    @Test(dataProvider = "validEmail")
    public void ValidEmail(String email) {
        boolean valid = Email.isEmailCorrect(email);
        Assert.assertEquals(true, valid);
    }
}

