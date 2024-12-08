package Inheritance;

class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public void calculateArea() {
        System.out.println("Calculating area");
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        circle.calculateArea();

        Rectangle rectangle = new Rectangle("Blue", 4, 7);
        rectangle.calculateArea();
    }
}
