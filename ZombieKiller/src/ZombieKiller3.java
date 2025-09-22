import java.util.Scanner;

public class ZombieKiller3 {

			public static void main(String[] args) {
			System.out.println("Welcome to our zombie killer program!!!!");

			String backpack[] = { "Shotgun", "Assault Rifle", "Sniper" };
			String zombies[] = { "Close-range zombie", "Mid-range zombie", "Long-range zombie" };
			
			System.out.println("Enter the Zombie you want to shoot: ");
			Scanner a = new Scanner(System.in);
			String input = a.nextLine();     // read input as String
			int zombie = Integer.parseInt(input);  // convert to int
		
			if (zombie == 1) {
				System.out.println("Its a Close-range zombie, pull out the " + backpack[0] + "!");
			}
			
			else if (zombie == 2) {
				System.out.println("Its a Mid-range zombie, pull out the " + backpack[1] + "!");
			}
			else if (zombie == 3) {
				System.out.println("Its a Long-range zombie, pull out the " + backpack[2] + "!");
			}
			else {
				System.out.println("Game Over!!!!!");
			}
			

//			System.out.println("Backpack items!");
//			System.out.println(backpack[0]);
//			System.out.println(backpack[1]);
//			System.out.println(backpack[2]);
	//
//			System.out.println("These are the zombies!");
//			System.out.println(zombies[0]);
//			System.out.println(zombies[1]);
//			System.out.println(zombies[2]);
		}

	}