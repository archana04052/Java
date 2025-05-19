package Day5;
class Bike{
	void speed() {
		System.out.println("250 km per hour");
	}
}
class Bmw extends Bike {
	void rev() {
		System.out.println("1000cc");
	}
}
class Model extends Bmw {
	void price() {
		System.out.println("just 30 lakhs");
	}
}

public class Demo2 {
	public static void main(String[] args) {
		Model d = new Model();
		d.speed();
		d.rev();
		d.price();
	}

}
