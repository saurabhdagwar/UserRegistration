package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givingFirstName_havingMinimum3char_shouldReturnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkFirstName("Saurabh");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givingFirstName_havingMinimum3char_shouldReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkFirstName("saurabh");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givingFirstName_havingMinimum3char_shouldReturnFalse2() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkFirstName("Sa");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givingLastName_havingMinimum3char_shouldReturnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkLastName("Dagwar");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givingLastName_havingMinimum3char_shouldReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkLastName("dagwar");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givingEmail_havingValidPattern_shouldReturnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkEmail("abc.xyz@bl.co.in");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givingEmail_havingValidPattern_shouldReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkEmail("abc.xyz@.in");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givingMobileNumber_10DigitMobileNumber_shouldReturnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkMobile("91 8856852313");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givingMobileNumber_10DigitMobileNumber_shouldReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkMobile("86852313");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givingPassword_min8char_shouldReturnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkPassword("Pass@123");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givingPassword_min8char_shouldReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkPassword("passw");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givingPassword_AtLeast1upperCase_shouldReturnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkPassword("Pass@123");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givingPassword_AtLeast1uppercase_shouldReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkPassword("pass@123");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givingPassword_AtLeast1Number_shouldReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkPassword("Password@");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givingPassword_exactly1Symbol_shouldReturnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkPassword("Password123");
        Assert.assertEquals(false,result);
    }
}


