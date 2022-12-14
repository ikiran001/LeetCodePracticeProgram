package MathsForDSA;

public class LeetCode204SeivesMethod {

	public static void main(String[] args) {
		int a=50;
		System.out.println(countPrimes(a));

	}

	public static int countPrimes(int n) {
		int count=0;
		boolean [] arr= new boolean[n+1];
		for (int i = 2; i*i <= n; i++) {
			if(!arr[i]) {
				for (int j = i*2; j < n; j+=i) {
					arr[j]=true;
				}
			}
		}

		for (int i = 2; i < n; i++) {
			if(!arr[i]) {
				count++;
			}
		}
		return count;
	}

}
