package Stringssss;
public class LeetCode1221 {
	public static void main(String[] args) {
		String s="RLRRLLRLRL";
		System.out.println(balancedStringSplit(s));

	}
	public static  int balancedStringSplit(String s) {
		int R=0;
		int L=0;
		int c=0;
		for (char ch: s.toCharArray()){
			if(ch=='R') {
				R++;	
			}
			else {L++;}
			if(R==L) {
				c++;
			}
		}
		return c;
	}
}
