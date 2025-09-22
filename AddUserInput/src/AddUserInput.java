import java.util.Scanner;

public class AddUserInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = scan.nextInt();

		System.out.print("Enter another number: ");
		int b = scan.nextInt();

		System.out.println(a + b);

	}

}