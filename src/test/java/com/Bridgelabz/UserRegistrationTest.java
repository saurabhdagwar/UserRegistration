package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class UserRegistrationTest {
    @Test
    public void FirstName_havingMinimum3char_returnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkFirstName("Saurabh");
        Assert.assertEquals(true,result);
    }

    @Test
    public void LastName_havingMinimum3char_returnTrue() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkLastName("Dagwar");
        Assert.assertEquals(true,result);
    }
}