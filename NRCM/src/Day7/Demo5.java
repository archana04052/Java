package Day7;
public class Demo5 { 
	static void add(int a,int b) { 
	      int c = a/b;
	      System.out.println(c);
	}
	public static void main(String args[]) {
		try {
		add(10,20);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}

