package Day_3;

abstract class Test5{
	abstract void add();
	abstract void sub();
	void div() {
		System.out.println("division");
	}
	void mod() {
		System.out.println("modulus");
	}
	static void mul() {
		System.out.println("multiply");
	}
}

class Demo6 extends Test5 {
	public void  add() {
		System.out.println("adding");
	}
	public void sub() {
		System.out.println("subtracting");
	}
	public static void main(String args[]) {
		Demo6 d1=new Demo6();
		d1.add();
		d1.mod();
		d1.sub();
		d1.div();
	}
	

}
