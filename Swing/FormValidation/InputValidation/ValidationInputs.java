package InputValidation;

import java.util.Scanner;
import java.util.regex.*;

public class ValidationInputs {
    Scanner in = new Scanner(System.in);

    public static boolean isValidUsername(String name) {
        String regex = "^[A-Za-z]\\w{5,29}$";
        Pattern p = Pattern.compile(regex);

        if (name == null) {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }

    public static boolean isValidFirstName(String firstName) {
        return firstName.matches("[A-Z][a-zA-Z]*");
    }

    public static boolean validateLastName(String lastName) {
        return lastName.matches("[a-zA-z]+([ '-][a-zA-Z]+)*");
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public static boolean isValidPhoneNumber(String s)
    {
        Pattern p = Pattern.compile("^[1-9][0-9]{9}$");
        Matcher m = p.matcher(s);
        return (m.matches());
    }
}
