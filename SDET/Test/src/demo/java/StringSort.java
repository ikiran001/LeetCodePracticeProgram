package demo.java;

public class StringSort {

	public static char[] sort(String n) {

		char arr[] = n.toCharArray();
		char temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					temp = arr[i];
					System.out.println("temp : "+temp);
					arr[i] = arr[j];
					System.out.println("arr[i] : "+arr[i]);
					arr[j] = temp;
					System.out.println("arr[j] : "+arr[j]);
				}
			}
		}

		return arr;
	}

	public static void main(String[] args) {

		String name = "ganesh";
		// sort(name);
		System.out.println(sort(name));

	}
}
