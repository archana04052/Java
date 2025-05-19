package cdc1;

class Sample23 {
	public void add() {
		System.out.println("hello");
	}
}

public class Sample extends Sample23 {
	public static void main(String args[]) {
		Sample s1 = new Sample();
		s1.add();
		
	}
	

}
