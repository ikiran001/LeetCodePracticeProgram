public class RevString {

	public static void main(String[] args) {

		String name = "Ganesh Kashid";
		String temp ="";
		for (int i = 0; i < name.length(); i++) {

			char ch = name.charAt(i);
			  temp = ch + temp;

		}
		System.out.print("rev : " + temp);
	}

}
