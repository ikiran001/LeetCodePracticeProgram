package MathsForDSA;
//https://leetcode.com/problems/the-kth-factor-of-n/description/
//1492. The kth Factor of n
import java.util.ArrayList;
import java.util.Collections;

public class LeetCode1492 {                      
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
	public static void main(String[] args) {
		int  n = 7; int k = 2;
		System.out.println(kthFactor(n, k));

	}
	public static int kthFactor(int n, int k) {
		ArrayList<Integer> list= new ArrayList<>();

		for(int i=1; i<=n;i++){
			if(n%i==0){
				list.add(i);
			}
		}
		if(k<=list.size()) {
			return list.get(k-1);
		}
		else return -1;
	}

}
