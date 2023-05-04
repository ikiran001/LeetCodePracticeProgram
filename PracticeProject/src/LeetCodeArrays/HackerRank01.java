package LeetCodeArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HackerRank01 {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		miniMaxSum(list);


	}
	public static void miniMaxSum(List<Integer> arr) {
		Collections.sort(arr);
		long min=0;
		for(int i=0; i<arr.size()-1;i++){
			min+=arr.get(i);
		}
		long max=0;
		for(int i=1;i<arr.size();i++){
			max+=arr.get(i);
		}
		System.out.println(min+" "+max);
	}
}
