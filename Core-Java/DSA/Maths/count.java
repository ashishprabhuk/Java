package DSA.Maths;

public class count {
    static int count1(int n){ //Solution - 1
        int x = n, count = 0;
        while (x!=0){
            x = x/10; // "1234/10 = 1234.5" but int will not consider decimals.
            count++;
        }
        return count;
    }

    static int count2(int n){ //Solution - 2
        String str = Integer.toString(n); // converting integer to string
        return str.length();
    }
    
    public static void main(String[] args) {
        System.out.println(count1(12345));
        System.out.println(count2(2143));
    }
}
