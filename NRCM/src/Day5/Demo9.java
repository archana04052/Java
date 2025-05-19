package Day5;
interface I1{
	abstract void add();
	void sub();
}

public class Demo9 implements I1 {
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Demo9 d1 = new Demo9();
		d1.add();
		d1.sub();
		

	}

}
