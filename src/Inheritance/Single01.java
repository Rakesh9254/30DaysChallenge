package Inheritance;
class Anima1l{
	void makeOfSound() {
		System.out.println("Animal Sound.");
	}
}
class Dog1 extends Animal{
	void makeOfSound() {
		System.out.println("Woof.");
	}
}
public class Single01 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.makeOfSound();
		Animal animal2 = new Dog1();
		animal2.makeOfSound();
		
	}

}
