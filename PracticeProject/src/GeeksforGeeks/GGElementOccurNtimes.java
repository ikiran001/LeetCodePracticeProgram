package GeeksforGeeks;

public class GGElementOccurNtimes {

	public static void main(String[] args) {

		String str = "adcffaet";
		String	patt = "onkl";
		System.out.println(minIndexChar(str, patt));
	}
	public static int minIndexChar(String str, String patt)   {
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < patt.length(); j++) {
				if(str.charAt(i)==patt.charAt(j)) {
					return i;
				}
			}
		}
		return -1;
	}

}
