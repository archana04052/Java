package Day7;
class ArchanaException extends Exception{
	public ArchanaException( String Message) {
		super(Message);
	}
}

public class Demo9 {
	public static void mathscheck(int a)throws ArchanaException {
		if (a%2==0) {
			throw new ArchanaException("even");
		}else {
			System.out.println("odd");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			mathscheck(12);
		}catch(ArchanaException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("happy coding");
		}
	}
}
