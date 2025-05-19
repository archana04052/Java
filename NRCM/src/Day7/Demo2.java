package Day7;
import java.util.*;
public class Demo2 {
	public static void main(String[] args) throws ArithmeticException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a and b");
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c =a/b;
		}catch(ArithmeticException |InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}
 
}
