package TypeCasting;

class Animal {
	void makesound() {
		System.out.println("Animal is making a sound.");
	}
}
class Dog extends Animal {
	void makesound() {
		System.out.println("Dog is Barking.");
	}
}
public class UpCasting {
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.makesound();
	}
}
