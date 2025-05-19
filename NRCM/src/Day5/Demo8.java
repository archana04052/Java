package Day5;
class Test1{
	void add() {
		System.out.println("hii");
	}
}
public class Demo8 extends Test1 {
	void add() {
		System.out.println("hello");
	}
	public static void main(String args[]) {
		Demo8 d1 = new Demo8();
		d1.add();
		
	}

}
