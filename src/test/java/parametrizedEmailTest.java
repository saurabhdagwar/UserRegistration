import com.Bridgelabz.UserDetails;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class parametrizedEmailTest {
    private final String emailTest;
    private final boolean expectedresult;

    public parametrizedEmailTest(String email, boolean expectedResult) {
        this.emailTest = email;
        this.expectedresult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {"abc.xyz@bl.co.in", true},
                {"abc@.com.my", false},
                {"abc100@yahoo.com", true},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc111@abc.com", true},
                {".abc@abc.com", false},
                {"abc100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc()*@gmail.com", false},
                {"abc@1.com", true},
                {"abc@%*.com", false},
                {"abc@1.com", true},
                {"abc..2002@gmail.com", false},
                {"abc@gmail.com.com", true},
                {"abc.@gmail.com", false},
                {"abc@gmail.com.com", true},
                {"abc@abc@gmail.com",false},
                {"abc+100@gmail.com",true},
                {"abc@gmail.com.1a",false},
                {"abc@gmail.com.aa.au",false}
        });
    }

    @Test
    public void Email_validateTest_ReturnTrueOrFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkEmail(this.emailTest);
        Assert.assertEquals(this.expectedresult, result);
    }
}
