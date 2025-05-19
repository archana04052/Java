package Day_1;

public class Test1 {
	int x=10,y=5;
	static int a=20,b=10;
	void mod() {
		System.out.println(x%y);
	}
	void mul() {
		System.out.println(a*b);
	}
	void div() {
		int a=30,b=3;
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.mod();
		t1.mul();
		t1.div();
	}

}
