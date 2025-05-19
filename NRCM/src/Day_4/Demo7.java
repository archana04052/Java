package Day_4;

class Test7 {
	void add() {
		System.out.println("hi");
	}

}
public class Demo7 extends Test7 {
	public static void main(String arg[]) {
		Demo7 d1 = new Demo7();
		//d1.add()//we cannot access the private variable in another class
	}
}