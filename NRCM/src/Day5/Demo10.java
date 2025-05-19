package Day5;
interface I3{
	void add(); 

}
class Test11{
	void sub() {
		System.out.println("hello");
}
}
public class Demo10 extends Test11 implements I3 {
	public void add() {
		System.out.println("hii");
	}
	

	public static void main(String[] args) {
		Demo10 d1= new Demo10();
		d1.add();
		d1.sub();
	}
}

