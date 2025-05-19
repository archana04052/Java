package Day_3;
abstract class Test7{
	abstract void add();
	void display() {
		System.out.println("Archana");
	}
	void show(){
		System.out.println("Chikka");
	}
	static void mul() {
		System.out.println("Multiply");
	}
	static void div() {
		System.out.println("Divide");
	}
}
class Archana extends Test7 {
	public void add() {
		System.out.println("Adding");
	}
	void sum() {
		System.out.println("Summing");
	}
}
class Demo7 extends Archana {
	public static void main(String args[]) {
		Demo7 d1 =new Demo7();
		d1.add();
		d1.display();
		d1.show();
		
		
		
	}
	
}
