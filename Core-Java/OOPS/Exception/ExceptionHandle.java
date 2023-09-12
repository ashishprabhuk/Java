package Exception;
//program to print the exception information using getMessage() method
public class ExceptionHandle {
    public static void main (String[] args) {
        int a=5, b=0;
        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("-------------------");
            e.printStackTrace();
            System.out.println("-------------------");
            System.out.println(e.toString());
        }
    }
}