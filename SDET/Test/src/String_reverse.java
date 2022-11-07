public class String_reverse {

	public static String reverseStr(String str) {

		StringBuilder rev = new StringBuilder();
		
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println("lenth :"+str.length());
			
			System.out.println(rev);
			
			rev.append(String.valueOf(str.charAt(i)));
		}

		return rev.toString();

	}

	public static void main(String[] args) {
		System.out.println("reverseStr:" + reverseStr("apple"));
		

	}
}
