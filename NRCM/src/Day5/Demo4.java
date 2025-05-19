package Day5;
class Movie{
	void genre() {
		System.out.println("Crime and thriller");
	}
}
class Hit extends Movie{
	void Action() {
		System.out.println("Investigation");
	}
}
class Hero extends Hit{
	void name() {
		System.out.println("Nani");
	}
}
class Heroine extends Hit{
	void acting() {
		System.out.println("Excellent");
	}
}

public class Demo4 {
	public static void main(String args[]) {
		Hero h1 = new Hero();
		Heroine a2 = new Heroine();
		h1.genre();
		h1.Action();
		h1.name();
		a2.acting();
		
		
	}

}
