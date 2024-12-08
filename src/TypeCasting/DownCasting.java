package TypeCasting;

class Animal1 {
	void makesound() {
		System.out.println("Animal is making Sound.");
	}
}
class Dog1 extends Animal1 {
	void makesound() {
		System.out.println("Dog is Barking.");
	}
}
public class DownCasting {
	public static void main(String[] args) {
		Animal1 animal = new Dog1();//upcasting 
		animal.makesound();
		Dog1 dog = (Dog1) animal;// downcasting
		dog.makesound();
	}
}
