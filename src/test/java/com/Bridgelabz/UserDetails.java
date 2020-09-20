package com.Bridgelabz;

import java.util.regex.Pattern;

public class UserDetails {
    public static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    public static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+#][a-zA-Z0-9]+)*@[a-zA-Z1-9]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,2})?$";
    public static final String MOBILE_PATTERN = "(^[0-9]{1,3}[ ]+)?[6-9]+[0-9]{9}$";
    public static final String PASSWORD_PATTERN = "(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%*&+?/!]{1,1}).{8,}";

    public boolean checkFirstName(String FirstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(FirstName).matches();
    }

    public boolean checkLastName(String LastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(LastName).matches();
    }

    public boolean checkEmail(String email) {
    Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    return pattern.matcher(email).matches();
    }

    public boolean checkMobile(String mobileNumber) {
        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        return pattern.matcher(mobileNumber).matches();
    }

    public boolean checkPassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}
