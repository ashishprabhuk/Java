package Zoho.Round2.Strings;

public class VersionComparison {
    public static int versionCompare(String v1, String v2) {
        String[] parts1 = v1.split("\\.");
        String[] parts2 = v2.split("\\.");

        int minLength = Math.min(parts1.length, parts2.length);

        for (int i = 0; i < minLength; i++) {
            int num1 = Integer.parseInt(parts1[i]);
            int num2 = Integer.parseInt(parts2[i]);

            if (num1 < num2) {
                return -1;
            } else if (num1 > num2) {
                return 1;
            }
        }

        if (parts1.length < parts2.length) {
            return -1;
        } else if (parts1.length > parts2.length) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        String version1 = "4.0.2";
        String version2 = "4.8.4";

        int result = versionCompare(version1, version2);

        if (result < 0) {
            System.out.println(version1 + " is smaller");
        } else if (result > 0) {
            System.out.println(version2 + " is smaller");
        } else {
            System.out.println("Both versions are equal");
        }
    }
}



/*
 * Print whether the version is upgraded, downgraded or not changed
 according to the input given.
example: 
Input : 
Version1 4.8.2 
Version2 4.8.4 
Output: upgraded, 

Input : 
Version1 4.0.2 
Version2 4.8.4 
Output: downgraded
 */