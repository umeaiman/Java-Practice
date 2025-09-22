public class ZombieKiller {

	public static void main(String[] args) {
		System.out.println("Welcome to our zombie killer program!!!!");

		String backpack[] = { "Shotgun", "Assault Rifle", "Sniper" };
		String zombies[] = { "Close-range zombie", "Mid-range zombie", "Long-range zombie" };
		
		if (zombies[0] != null) {
			System.out.println("Its a Close-range zombie, pull out the " + backpack[0]);
		}
		
		if (zombies[1] != null) {
			System.out.println("Its a Mid-range zombie, pull out the " + backpack[1]);
		}
		if (zombies[2] != null) {
			System.out.println("Its a Long-range zombie, pull out the " + backpack[2]);
		}
		
		

//		System.out.println("Backpack items!");
//		System.out.println(backpack[0]);
//		System.out.println(backpack[1]);
//		System.out.println(backpack[2]);
//
//		System.out.println("These are the zombies!");
//		System.out.println(zombies[0]);
//		System.out.println(zombies[1]);
//		System.out.println(zombies[2]);
	}

}