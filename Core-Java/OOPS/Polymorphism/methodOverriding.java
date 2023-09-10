package Polymorphism;

class Animal {
    void sound(){
        System.out.println("Animal is barking");
    }

    String sound(String name){
        name = "moan";
        return name;
    }
}

class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("Dog is barking");
    }
}
class cat extends Animal {
    @Override
    String sound(String a){
        return a;
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Animal me;
        me=new Animal();
        me.sound();
        me = new Dog();
        me.sound();
        me = new cat();
        System.out.println(me.sound("moew"));
    }
}
