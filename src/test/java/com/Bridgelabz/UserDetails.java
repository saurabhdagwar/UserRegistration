package com.Bridgelabz;

import java.util.regex.Pattern;

public class UserDetails {
    public static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    public static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+#][a-zA-Z0-9]+)*@[a-zA-Z1-9]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,2})?$";

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
}
