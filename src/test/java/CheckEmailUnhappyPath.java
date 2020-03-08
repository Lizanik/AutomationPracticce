import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailUnhappyPath {
    @DataProvider
    public Object[][] invalidEmail() {
        return new Object[][]{
                {"kateryna"},
                {"kateryna@.gmail.com"},
                {"kateryna@gmail."},
                {"roman@.com"},
                {"roman@.com.com"},
                {"+roman@gmail.com"},
                {"roman()@yandex.com"},
                {"roman&.com"},
                {"roman%&*.com"},
                {"roman@@gmail.com"},
                {"roman@gmail.com*&)"},
                {"ro man@mail.ru"},
                {"rn@gmail.com"},
                {"roman_roman_roman_roman_roman_roman_roman_roman@gmail.com"}
        };
    }

    @Test(dataProvider = "invalidEmail")
    public void checkInValidEmail(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertFalse(actualResult);
}
}

