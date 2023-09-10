package Polymorphism;

class main{
    public void foo(int a,String b){ 
        // a = 21;
        // b = "hello";
        System.out.println(a + " " + b);
    }

    public int foo(int a, double b){
        return a + (int)b;
    }

    static double foo(double a, double b){
        return Math.ceil(a + b);
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        main m = new main();
        m.foo(1, "Ashish");
        System.out.println(m.foo(21, 2.03));
        System.out.println(m.foo(2.1, 2.2));
        
    }
}