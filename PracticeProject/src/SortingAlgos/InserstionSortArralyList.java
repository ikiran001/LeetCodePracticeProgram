package SortingAlgos;

import java.util.Collections;
import java.util.List;

public class InserstionSortArralyList {

	public static void main(String[] args) {
	}


	public static void insertionSort2(int n, List<Integer> arr) {
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j >0 ; j--) {
				if(arr.get(j)<arr.get(j-1)) {
					Collections.swap(arr, j-1, j);
					System.out.println(arr);
				}
				else break;
			}

		}

	}


}
