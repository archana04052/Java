package Day7;
class CheppanuException extends Exception{
	public CheppanuException( String message) {
		super(message);
	}
	
}
public class Demo8 {
	public static void agecheck( int age)throws CheppanuException {
		 if(age>18) {
			 throw new CheppanuException("nenu cheppanu");
	}else {
		System.out.println("na age 18 below");
	}
    	   
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			agecheck(12);
		}catch(CheppanuException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("happy coding");
		}

	}

}
