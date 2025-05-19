package Day5;
class Animal {
	void sleep() {
		System.out.println("Sleeping");
	}
}

class Dog extends Animal{
	void barking() {
		System.out.println("Dog is Barking");
	}
}
public class Demo1 {
	public static void main(String args[]) {
		Dog d1 = new Dog();
		d1.barking();
		d1.sleep();
		
	}

}
