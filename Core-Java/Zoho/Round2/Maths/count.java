package Zoho.Round2.Maths;

public class count {
    static int count1(int n){ //Solution - 1
        int x = n, count = 0;
        while (x!=0){
            x = x/10; // "12345/10 = 1234" => "1234/10 = 123" => "123/10 = 12" => "12/10 = 1" => "1/10 = 0"
            count++;  //               1                  2                3               4             5
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
