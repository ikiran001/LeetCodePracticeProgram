package Stringssss;

public class LeetCode1528 {

	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		System.out.println(restoreString(s, indices));

	}
	static String restoreString(String s, int[] indices) {
		int n=s.length();
		char[] arr=new char[n];

		for (int i = 0; i < n; i++) {
			arr[indices[i]]=s.charAt(i);
		}
		
		
		String a="";
		for (int i = 0; i <n; i++) {
			a+=arr[i];
		}

		return a;
	}
}



