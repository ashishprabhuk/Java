class MyClass {
    public int publicVar;
    private int privateVar;
    protected int protectedVar;
    int packageVar; // default access

    public MyClass() {
        publicVar = 1;
        privateVar = 2;
        protectedVar = 3;
        packageVar = 4;
    }

    public void publicMethod() {
        System.out.println("publicMethod: " + publicVar);
    }

    private void privateMethod() {
        System.out.println("privateMethod: " + privateVar);
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod: " + protectedVar);
    }

    void packageMethod() {
        System.out.println("packageMethod: " + packageVar);
    }
}

class AnotherClass extends MyClass {
    public void accessProtectedVar() {
        System.out.println("accessProtectedVar: " + protectedVar);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.publicMethod(); // Accessible
        // obj.privateMethod(); // Not accessible (private)
        obj.protectedMethod(); // Not accessible (protected)
        obj.packageMethod(); // Not accessible (default)

        AnotherClass anotherObj = new AnotherClass();
        anotherObj.accessProtectedVar(); // Accessing protectedVar via a subclass

        // Accessing package-level members from a different package is not allowed.
        // obj.packageVar and obj.packageMethod are not accessible here.
    }
}

