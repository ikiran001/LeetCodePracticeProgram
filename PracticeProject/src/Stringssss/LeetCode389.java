package Stringssss;

public class LeetCode389 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public char findTheDifference(String s, String t) {
		int i=0;
while (i < t.length()) {
	if(s.contains(String.valueOf(t.charAt(i)))) {
		i++;
	}
	else {
		return t.charAt(i);
	}
	
}
return 0;

	}
}
