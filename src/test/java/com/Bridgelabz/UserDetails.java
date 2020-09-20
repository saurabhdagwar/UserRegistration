package com.Bridgelabz;

import java.util.regex.Pattern;

public class UserDetails {
    public static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    public boolean checkFirstName(String FirstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(FirstName).matches();
    }
}
