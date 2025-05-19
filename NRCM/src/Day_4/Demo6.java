package Day_4;

public class Demo6 {
	int ssc;
	int inter;
	int btech;
	public Demo6() {
		System.out.println("Welcome to My Profile: Archana");
	}
	public Demo6(int ssc) {
		this.ssc=ssc;
		System.out.println("ssc:"+ssc);
	}
	public Demo6(int ssc,int inter) {
		this.ssc=ssc;
		System.out.println("ssc and inter:"+ssc+inter);
	}
	public Demo6(int ssc,int inter,int btech) {
		this.ssc=ssc;
		System.out.println("ssc and inter and btech:"+ ssc + inter + btech);
	}
	public static void main(String args[]) {
		 Demo6 d1 = new  Demo6();
		 Demo6 d2 = new  Demo6(498);
		 Demo6 d3 = new  Demo6(498,580);
		 Demo6 d4 = new  Demo6(498,580,969);
		 
		
	}

}
