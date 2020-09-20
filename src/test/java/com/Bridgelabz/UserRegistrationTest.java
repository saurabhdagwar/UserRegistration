package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {

    @Test
    public void FirstName_havingMinimum3char_returnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkFirstName("Saurabh");
        Assert.assertEquals(true, result);
    }

    @Test
    public void LastName_havingMinimum3char_returnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkLastName("Dagwar");
        Assert.assertEquals(true, result);
    }

    @Test
    public void Email_havingValidPattern_returnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkEmail("abc.xyz@bl.co.in");
        Assert.assertEquals(true, result);
    }

    @Test
    public void MobileNumber_10DigitMobileNumber_returnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkMobile("91 8856852313");
        Assert.assertEquals(true,result);
    }

    @Test
    public void Password_pattern_returnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkPassword("Pass@123");
        Assert.assertEquals(true,result);
    }
}