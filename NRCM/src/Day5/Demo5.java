package Day5;
class Chocolate {
	void ate() {
		System.out.println("eating");
	}
}
class Dark extends Chocolate {
	void taste1() {
		System.out.println("good");
	}
}
class Sweet extends Chocolate{
	void taste2() {
		System.out.println("Sweetest");
	}
}
class Bournvelli extends Dark{
	void cost1() {
		System.out.println("80");
	}
}
class Amul extends Dark{
	void cost2() {
		System.out.println("90");
	}
}
class Dairymilk extends Sweet{
	void Weight1() {
		System.out.println("100gms");
	}
}
class Kitkat extends Sweet{
	void Weight2() {
		System.out.println("200gms");
	}
}
public class Demo5 {
	public static void main(String args[]) {
		Bournvelli b1 = new Bournvelli();
		Amul a1 = new Amul();
		Dairymilk d1 = new  Dairymilk();
		Kitkat k1 = new Kitkat();
		b1.ate();
		b1.cost1();
		b1.taste1();
		a1.cost2();
		d1.Weight1();
		k1.Weight2();
		
		
	}

}
