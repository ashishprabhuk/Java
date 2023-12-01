package Zoho.Round2.Strings;
import java.util.*;

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        String strength = checkPasswordStrength(password);
        System.out.println("Password Strength: " + strength);

        scanner.close();
    }

    public static String checkPasswordStrength(String password) {
        if (password.length() <= 4) {
            return "Weak";
        }

        boolean rule1 = password.matches(".*[a-z].*"); // At least one lowercase letter
        boolean rule2 = password.matches(".*[A-Z].*"); // At least one uppercase letter
        boolean rule3 = password.matches(".*[0-9].*");   // At least one digit
        boolean rule4 = password.matches(".*[!@#$%^&*?].*"); // At least one special character

        int satisfiedRules = 0;
        if (rule1) satisfiedRules++;
        if (rule2) satisfiedRules++;
        if (rule3) satisfiedRules++;
        if (rule4) satisfiedRules++;

        if (satisfiedRules == 1 || satisfiedRules == 0) {
            return "Weak";
        } else if (satisfiedRules == 2) {
            return "Medium";
        } else if (satisfiedRules == 3) {
            return "Good";
        } else if (satisfiedRules == 4) {
            return "Strong";
        } else {
            return "Weak";
        }
    }
}


/*
 * Password Strength
Find the strength of the given password string
based on the conditions
Four rules were given based on the type and no. of
characters in the string.
Weak – only Rule 1 is satisfied or Rule 1 is not
satisfied
Medium – Two rules are satisfied
Good – Three rules satisfied
Strong – All Four rules satisfied
I/P: Qw!1 O/P: Weak
I/P: Qwertyuiop O/P: Medium
I/P: QwertY123 O/P: Good
I/P: Qwerty@123 O/P: Strong
 */