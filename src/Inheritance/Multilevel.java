package Inheritance;

class Animal {
	void makeOfSound() {
		System.out.println("Animal Sound");
	}
}

class Dog extends Animal {
	void makeOfSound() {
		System.out.println("Woof!.");
	}
}

class Cat extends Dog {
	void makeOfSound() {
		System.out.println("Meow!");
	}
}

public class Multilevel {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.makeOfSound();
		Animal animal1 = new Dog();
		animal.makeOfSound();
		Animal animal2 = new Cat();
		animal2.makeOfSound();
	}

}
