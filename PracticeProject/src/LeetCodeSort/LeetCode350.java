package LeetCodeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode350 {

	public static void main(String[] args) {
		int[] arr1= {1,2,2,1};
		int[] arr2= {2};
		intersect(arr1, arr2);
		System.out.println(Arrays.toString(intersect(arr1, arr2)));

	}
	static int[] intersect(int[] nums1, int[] nums2) {


		List<Integer> list=new ArrayList<>();
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if(nums1[i]==nums2[j] ) {
					list.add(nums1[i]);
					break;
				}

			}

		}
		int[] arr=new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i]=list.get(i);
		}

		return arr;
	}

}
