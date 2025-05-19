package Day_1;

public class command2 {
	public static void main(String[] args) {
		String color=args[0];
		switch(color) {
		case "red":
			System.out.println("celebrate holi");
			break;
		case "green":
			System.out.println("Celebrate Ramzan");
			break;
		case "white":
			System.out.println("celebrate Christamas");
			break;
		default:
			System.out.println("no festival");
			
		}
		}

}
