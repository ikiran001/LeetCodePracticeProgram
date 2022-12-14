package Recursion;

import java.util.ArrayList;

public class RecursionWithArrayFindTarget {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,5,86,5};
		System.err.println(allTarget(arr, 5, 0, list));

		allTargetIndex(arr, 5, 0);
		System.out.println(list);


	}
	//---------------------------------------------------------------------//---------------------------------------------------------------------//---------------------------------------------------------------------	

	public static boolean isPresent(int [] arr, int target, int index) {
		if(index>arr.length-1) {
			return false;
		}
		return (arr[index]==target) || isPresent(arr, target, index+1);

	}

	//---------------------------------------------------------------------//---------------------------------------------------------------------//---------------------------------------------------------------------	

	static ArrayList<Integer> list=new ArrayList<>();
	public static void allTargetIndex(int[] arr, int target, int index) {
		if(arr[index]==target) {
			list.add(index);
		}
		if(index==arr.length-1) {
			return;
		}
		else allTargetIndex(arr, target, index+1);
	}
	
	//---------------------------------------------------------------------//---------------------------------------
	
	static ArrayList<Integer> allTarget(int []arr, int target , int index, ArrayList<Integer> list) {
		if(arr[index]>arr.length-1) {
			return list;
		}
		if(arr[index]==target) {
		list.add(index);
		
		}
		return allTarget(arr, target, index+1, list);

		
		
	}

}
