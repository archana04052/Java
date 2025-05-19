package Day5;
class Archana{
	int x=99;
}


public class Demo12 extends Archana{
int y=70;
public void show() {
	System.out.println(y);
	System.out.println(super.x);
}
public static void main(String args[]) {
	Demo12 d1 = new Demo12();
	d1.show();
}
}
