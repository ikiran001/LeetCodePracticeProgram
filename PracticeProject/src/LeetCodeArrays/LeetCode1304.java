package LeetCodeArrays;

public class LeetCode1304 {

	public static void main(String[] args) {
		int n=4;
		System.out.println(sumZero(n));

	}
	public static int[] sumZero(int n) {
		int [] arr=new int[n];
		if(n%2==0) {
			int i=1;
			while(i<=n/2) {
				arr[i-1]=i;
				i++;
			}
			while(i<=n) {
				arr[i-1]=i-n-1;
				i++;
			}
			return arr;
		}
		else {
			int i=0;
			while(i<=n/2) {
				arr[i]=i;
				i++;
			}
			while(i<n) {
				arr[i]=i-n;
				i++;
			}
			return arr;}

	}
}
