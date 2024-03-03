package Zoho.Round2.Strings;

public class CharacterRange {
    public static void main(String[] args) {
        String firstString = "abracadabra";
        String secondString = "cadabra";
        String result = findCharacterRange(firstString, secondString);
        System.out.println(result);
    }

    static String findCharacterRange(String firstString, String secondString) {
        if (firstString.isEmpty() || secondString.isEmpty()) {
            return ""; 
        }
        int minIndex = Integer.MAX_VALUE;
        int maxIndex = Integer.MIN_VALUE;
        for (char c : secondString.toCharArray()) {
            int index = firstString.indexOf(c);
            if (index != -1) {
                minIndex = Math.min(minIndex, index);
                maxIndex = Math.max(maxIndex, index);
            } else {
                return "";
            }
        }
        return firstString.substring(minIndex, maxIndex + 1);
    }
}
