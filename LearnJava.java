package learningJava;

public class LearnJava {

	public static void main(String[] args) {
		String exclaim = addExclamationPoint ("Waseem");
		System.out.println(exclaim);
	}

	public static String addExclamationPoint (String s) {
		return s+"!";
	}
}
