package LeetCodeSort;

public class LeetCode1502 {

	public static void main(String[] args) {
int[] arr= {1,2,5};
 System.out.println( canMakeArithmeticProgression(arr));

	}
	public static boolean canMakeArithmeticProgression(int[] arr) {
		bubbleSort(arr);
		int count=1;
		int pro=arr[1]-arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]-arr[i-1]==pro) {
				count++;
			}
		}
		if(count==arr.length) {
			return true;
		}
		return false;
		}
	
	
	static void bubbleSort(int [] arr) {
		boolean swapped;
		for (int i = 0; i < arr.length; i++) {
			swapped=false;
			for (int j = 1; j < arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}
			}
			if(!swapped) { //
				break;
			}
		}
		
	}

	
	
}
