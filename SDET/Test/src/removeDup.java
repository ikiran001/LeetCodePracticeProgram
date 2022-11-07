public class removeDup {

	public static String removeDup(String str) {

		String strNoDup = "";

		for (char ch : str.toCharArray()) {

			if (!strNoDup.contains(String.valueOf(ch))) {

				strNoDup = strNoDup + ch;
			}

		}

		return strNoDup;
	}

	public static void main(String[] args) {
		String h = "hello";
		System.out.println(removeDup(h));
		// removeDup(h);

	}

}
