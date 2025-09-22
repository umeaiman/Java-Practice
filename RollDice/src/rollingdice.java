import java.util.Random;

public class rollingdice {

	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(6) + 1;
		System.out.println("-----");
		System.out.println("| " + x + " |");
		System.out.println("-----");
	}

}
