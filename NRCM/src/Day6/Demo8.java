package Day6;

public class Demo8 {
	public static void main(String args[]) {
		int a =20;
		try {
			int b =Integer.parseInt(args[0]);
			int c =a/b;
			System.out.println(c);
	}catch(Exception e) {
		System.out.println(e);
	}
System.out.println("Hello");
}
}
