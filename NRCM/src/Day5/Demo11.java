package Day5;
class Sample45{
	public Sample45() {
		System.out.println("Good Evening");
	}
	int x =99;
	void print() {
		System.out.println("hello");
	}
}

public class Demo11 extends Sample45 {
	public Demo11() {
		super();
	}
    void show() {
    	int y=45;
    	super.print();
    	System.out.println(super.x);
    	System.out.println(y);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo11 d1 = new Demo11();
		d1.show();

	}

}
