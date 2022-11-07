package demo.java;

public class RevString {

	public static String rev(String n) {
		String TempRev = "";

		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);
			TempRev = ch + TempRev;

		}

		return TempRev;
	}

	public static void main(String[] args) {

		String name = "Ganesh Kashid";

		// rev(name);
		System.out.println(rev(name));

	}

}
