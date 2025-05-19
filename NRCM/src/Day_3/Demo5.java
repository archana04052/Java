package Day_3;

abstract class Test3{
	abstract void add();
	abstract void sum();
}

class Demo5 extends Test3 {
	public void add() {
		System.out.println("hi");
	}
	public void sum() {
		System.out.println("hello");
	}
	public static void main(String args[]) {
		Demo5 d1 = new Demo5();
		d1.add();
		d1.sum();
	}

}
