import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.DataProvider;

public class CheckEmailUnhappyPath {
    @DataProvider
    public Object[][] invalidEmail() {
        return new Object[][]{
                {new String[]{
                        "kateryna",
                        "kateryna@.gmail.com",
                        "kateryna@gmail.",
                        "roman@.com",
                        "roman@.com.com",
                        "+roman@gmail.com",
                        "roman()@yandex.com",
                        "roman&.com",
                        "roman%&*.com",
                }
                }
        };
    }

    @Test
    private Email emailValidator;
    public void InValidEmail(String[] Email) {

        for(String temp : Email ){
            boolean valid = emailValidator.isEmailCorrect(temp);
            System.out.println("username is valid : " + temp + " , " + valid);
            Assert.assertEquals(false, valid);
        }
    }
}
