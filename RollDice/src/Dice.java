import java.util.Random;
import java.util.Scanner;

public class Dice {

public static void main(String[] args) {
	int numSides;
	int roll;

	Scanner scan = new Scanner(System.in);
	Random rand = new Random();

	System.out.println("How many sides?");
	numSides = scan.nextInt();

		roll = rand.nextInt(numSides) + 1;
		System.out.println("You rolled a: " + roll);
		scan.close();
}
}