package Day_4;

public class Demo2 {
	private String firstName;
	private String lastName;
	private String email;
	private String Phonenumber;
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
	public void setEmail(String ei) {
		email=ei;
	}
	public void setphone(String pn) {
		Phonenumber=pn;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return Phonenumber;
	}
	
    public static void main(String args[]) {
    	Demo2 d1=new Demo2();
    	d1.setFirstName("Archana");
    	d1.setLastName("chikka");
    	d1.setEmail("srija");
    	d1.setphone("999999999");
    	System.out.println(d1.getFirstName());
    	System.out.println(d1.getLastName());
    	System.out.println(d1.getEmail());
    	System.out.println(d1.getPhone());
    }
}

