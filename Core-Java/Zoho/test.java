package Zoho;

public class test {
    public static void main(String[] args) {
        String str = "Name: Ashish Prabhu-K,2143";
        char[] chars = str.toCharArray();
        reverse(chars);
        System.out.println(new String(chars));
    }
    static void reverse(char[] chars){
        int start = 0;
        int end = chars.length-1;
        while(start<end){
            while(start<end && !Character.isLetterOrDigit(chars[start])){
                start++;
            }
            while(start<end && !Character.isLetterOrDigit(chars[end])){
                end--;
            }
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            
            start++;
            end--;
        }
    }
}
