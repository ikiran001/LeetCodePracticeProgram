package LeetCodeArrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1431 {

	public static void main(String[] args) {
		int[] candies= {2,3,5,1,3};

		System.out.println(kidsWithCandies(candies, 3));
	}
	static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int maxValue=0;
		List<Boolean> result=new ArrayList<>();
		for (int i = 0; i < candies.length; i++) {
			maxValue=Math.max(candies[i], maxValue);
		}

		for (int i = 0; i < candies.length; i++) {
			if(candies[i]+extraCandies>=maxValue) {
				result.add(true);
			}
			else{result.add(false);}
		}
		return result;

	}

}
