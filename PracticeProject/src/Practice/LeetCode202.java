package Practice;
//https://leetcode.com/problems/happy-number/
//202. Happy Number
public class LeetCode202 {

	public static void main(String[] args) {
		int a=2;
		System.out.println(isHappy(a));

	}

	static boolean isHappy(int n) {	
		int count=0;
		while(n>=2) {
			int sum=0;
			while(n>0) {

				int m= n%10;
				sum+= m*m;
				n=n/10;
			}
			n=sum;
			count++;
			if(count>100) {
				return false;
			}
		} 
		return true;
	}

}
