package ObjectClass;
class Person implements Cloneable {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person(name=" + name + ", age=" + age + ")";
    }
}

public class ObjectClasses {

    @Override
    protected void finalize() throws Throwable {
        // Perform cleanup operations here
        System.out.println("Finalize method called.");
        super.finalize();
    }
    public static void main(String[] args) {

        // Object class example
        Object obj1 = new Object();
        Object obj2 = new Object();

        // Checking if two objects are equal
        if (obj1.equals(obj2)) {
            System.out.println("obj1 and obj2 are equal.");
        } else {
            System.out.println("obj1 and obj2 are not equal.");
        }

        // obj1 = obj2;

        // Hash code of objects
        System.out.println("Hash code of obj1: " + obj1.hashCode());
        System.out.println("Hash code of obj2: " + obj2.hashCode());

        // Printing object details
        System.out.println("Details of obj1: " + obj1.toString());

        //getClass
        Boolean str = true;
        Class<?> clazz = str.getClass();
        System.out.println("Class of str: " + clazz.getName());

        //instanceof
        Object obj = "Hello, World!";
        if (obj instanceof String) {
            System.out.println("obj is an instance of String.");
        } else {
            System.out.println("obj is not an instance of String.");
        }

        //finalize
        ObjectClasses finalize = new ObjectClasses();
        finalize = null; // Make the object eligible for garbage collection
        System.gc(); // Request garbage collection

        //clone() 
        Person p1 = new Person("John Doe", 30);
        try {
            Person p2 = (Person) p1.clone();
            System.out.println(p1);
            System.out.println(p2);
        } catch (CloneNotSupportedException e) {
        e.printStackTrace();
        }
    }
}
