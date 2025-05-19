package Day_4;

public class Demo8  {
	private void add() {
		System.out.println("hi");
	}

	public static void main(String arg[]) {
		Demo7 d1 = new Demo7();
		d1.add();//we cannot access the private variable in another class
	}
}
