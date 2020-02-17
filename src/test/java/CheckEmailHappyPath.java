import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.DataProvider;

public class CheckEmailHappyPath {
    @DataProvider
    public Object[][] validEmail() {
        return new Object[][]{
                {new String[]{
                        "kateryna@gmail.com",
                        "kateryna23@gmail.com",
                        "roman.25@gmail.com",
                        "roman-67@gmail.com",
                        "roman55@yandex.com",
                        "roman@roman.com",
                        "roman+45@gmail.com"
                }
                }
        };
    }

    @Test(dataProvider="validEmail")
    private Email emailValidator;
    public void ValidEmail(String[] Email) {

        for (String temp : Email) {
            boolean valid = emailValidator.isEmailCorrect(temp);
            System.out.println("Username is valid : " + temp + " , " + valid);
            Assert.assertEquals(true, valid);
        }
    }
}

