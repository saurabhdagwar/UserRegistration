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
    public void FirstName_havingMinimum3char_returnFalse() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkFirstName("saurabh");
        Assert.assertEquals(false, result);
    }

    @Test
    public void FirstName_havingMinimum3char_returnFalse2() {
        UserDetails userDetails = new UserDetails();
        boolean result = userDetails.checkFirstName("Sa");
        Assert.assertEquals(false, result);
    }

}
