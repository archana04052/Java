package Day_4;

public class Demo4{
	int a;
	int b;
	public Demo4(int x,int y) {
		x=a;
		y=b;
		System.out.println(x+y);	
	}
	public void add() {
		System.out.println(this.a-this.b);
	}
	public static void main(String args[]) {
		Demo4 d1=new Demo4(90,100);
		d1.add();
	}
}