package Day5;

public class Demo6 {
	void show() {
		System.out.println("Good Morning");
	}
	void show( int a,int b) {
		System.out.println(a+b);
	}
	void show(double d1,double d2) {
		System.out.println(d1-d2);
	}
	void show(String s1,String s2) {
		System.out.println(s1+s2);
	}
	public static void main(String args[]) {
		Demo6 d1 =  new Demo6();
		d1.show();
		d1.show(10, 20);
		d1.show(8.8, 9.8);
		d1.show("Archana", "chikka");
		
	}

}
