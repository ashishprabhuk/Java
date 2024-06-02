package Zoho.Round2.Strings;

import java.util.Scanner;

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

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        int ruleCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (!hasLower) {
                    hasLower = true;
                    ruleCount++;
                }
            } else if (c >= 'A' && c <= 'Z') {
                if (!hasUpper) {
                    hasUpper = true;
                    ruleCount++;
                }
            } else if (c >= '0' && c <= '9') {
                if (!hasDigit) {
                    hasDigit = true;
                    ruleCount++;
                }
            } else if (isSpecialCharacter(c)) {
                if (!hasSpecial) {
                    hasSpecial = true;
                    ruleCount++;
                }
            }
            // Early termination if all rules are satisfied
            if (ruleCount == 4) {
                return "Strong";
            }
        }

        switch (ruleCount) {
            case 1:
                return "Weak";
            case 2:
                return "Medium";
            case 3:
                return "Good";
            default:
                return "Weak";
        }
    }

    private static boolean isSpecialCharacter(char c) {
        return "!@#$%^&*?".indexOf(c) != -1;
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