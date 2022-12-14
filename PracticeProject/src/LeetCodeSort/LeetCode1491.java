package LeetCodeSort;
//1491. Average Salary Excluding the Minimum and Maximum Salary
//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class LeetCode1491 {

	public static void main(String[] args) {
		int[] arr={1000,2000,3000};
		System.out.println(average(arr));
		
	}
	static double average(int[] salary) {
		double addSal=0;
		int n=salary.length;
		bubbleSearch(salary);
		for (int i = 1; i < n-1; i++) {
			addSal+=salary[i];
		}
		return addSal/(n-2);
	}

	static void bubbleSearch(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}


}
