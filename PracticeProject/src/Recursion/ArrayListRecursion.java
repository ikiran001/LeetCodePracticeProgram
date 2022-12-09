package Recursion;

import java.util.ArrayList;

public class ArrayListRecursion {

	public static void main(String[] args) {
		int [] arr= {1,1,2,3,4,5,6,7};
		System.out.println(allIndices(0, 1, arr));

	}
	static ArrayList<Integer> allIndices(int index, int target, int [] arr){
		ArrayList<Integer > list=new ArrayList<>();
		if(arr[index]==arr.length-1) {
			return list;

		}
		if(arr[index]==target) {
			list.add(index);
		}

		ArrayList<Integer> ans= allIndices(index+1, target, arr);
		list.addAll(ans);
		return list;
	}

}