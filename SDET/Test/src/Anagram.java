import java.util.Arrays;

public class Anagram {

	public static boolean isAnagram(String str, String str1) {

		char[] arrstr = str.toCharArray();
		char[] arrstr1 = str1.toCharArray();

		Arrays.sort(arrstr);
		Arrays.sort(arrstr1);
		return Arrays.equals(arrstr, arrstr1);
	}

	public static void main(String[] args) {

		String a = "Ganesh";
		String b = "hsenaG";

		System.out.println(isAnagram(a, b));

	}

}
