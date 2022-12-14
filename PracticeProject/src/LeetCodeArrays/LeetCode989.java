package LeetCodeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/add-to-array-form-of-integer/
/*The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1]*/

public class LeetCode989 {

	public static void main(String[] args) {
		int [] num= {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
		System.out.println(	addToArrayForm(num , 516));
	}


	static List<Integer> addToArrayForm(int[] num, int k) {
	      
        final LinkedList<Integer> result = new LinkedList<>();
        int len = num.length - 1;
        
        while(len >= 0 || k != 0){
            
            if(len >= 0){
                k += num[len--];
            }
            
            result.addFirst(k % 10);
            k /= 10;
        }
            
        return result;
        
    }



}
