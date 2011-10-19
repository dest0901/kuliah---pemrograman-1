import java.util.Scanner;

public class Method {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		Tuna tunaObject = new Tuna();
		
		System.out.println("Enter your name here : " );
		String name = input.nextLine();
		
		tunaObject.simpleMessage(name);
	}
}