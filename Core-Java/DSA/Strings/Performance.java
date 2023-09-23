package DSA.Strings;
public class Performance {
    
    public static void NormalStr(){
        String series = "";
        for (int i = 0; i < 26; i++){
        char ch = (char) ('a' + i);
        series += ch;
        }
        System.out.println(series);
    }

    public static void Builder(){
        StringBuilders builder = new StringBuilders();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());

        // builder.reverse();
        // System.out.println(builder);
    }
    public static void main(String[] args) {
        NormalStr(); //prints normal string affecting the performance by holding old values in memory.
        Builder(); // prints the updated values of objects instead of keeping them in memory.
    }
}
