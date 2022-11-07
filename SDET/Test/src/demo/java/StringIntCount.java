package demo.java;

public class StringIntCount {

	public static void main(String[] args) {

		String s = "123ganesh123";
		String temp = s.replaceAll("[\\D]", "");
		temp.toCharArray();

		// System.out.println(temp.toCharArray());
		// int w = Integer.parseInt(temp);
		// String in = Integer.toString(w);

		
		int ret = 0;
		int[] numbers = new int[temp.length()];
		
		for (int i = 0; i < temp.length(); i++) {
			// System.out.println(temp.charAt(i));
			numbers[i] = temp.charAt(i) - '0';
			System.out.println(numbers[i]);
			ret = ret + numbers[i];
		}
		
		System.out.println(ret);

	}
}
