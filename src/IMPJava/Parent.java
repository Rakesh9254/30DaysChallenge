package IMPJava;

public class Parent {
    public Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls the constructor of Parent
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        Child child = new Child();
    }
}
