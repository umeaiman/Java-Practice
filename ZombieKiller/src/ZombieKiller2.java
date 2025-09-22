public class ZombieKiller2 {

    public static void main(String[] args) {
        System.out.println("Welcome to our zombie killer program!!!!");

        String backpack[] = { "Shotgun", "Assault Rifle", "Sniper" };
        String zombies[] = { "Close-range zombie", "Mid-range zombie", "Long-range zombie" };

        // Loop through zombies and match with backpack
        for (int i = 0; i < zombies.length; i++) {
            if (zombies[i] != null) {
                System.out.println("It's a " + zombies[i] + ", pull out the " + backpack[i]);
            }
        }
    }
}
