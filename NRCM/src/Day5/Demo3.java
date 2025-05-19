package Day5;
class Fruits {
	void benifits() {
		System.out.println("Healthy");
	}
}
class Apple extends Fruits {
	void color() {
		System.out.println("red");
	}
}
class Mango extends  Fruits {
	void Price() {
		System.out.println("50");
	}
}
class Banana extends  Fruits {
	void Taste() {
		System.out.println("Sweet");
	}
}

public class Demo3 {
	public static void main(String args[]) {
		Apple a1 = new Apple();
		Mango m1 = new Mango();
		Banana b1 = new Banana();
		a1.color();
		a1.benifits();
		m1.Price();
		b1.Taste();
		
	}

}
