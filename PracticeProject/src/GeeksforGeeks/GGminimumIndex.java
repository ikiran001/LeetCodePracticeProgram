package GeeksforGeeks;

import java.util.Arrays;

public class GGminimumIndex {

	public static void main(String[] args) {
		
int[] a= {1,2,3,5};
System.out.println(MissingNumber(a, 5));
	}
	 static int MissingNumber(int array[], int n) {
       Arrays.sort(array);
       int i=0;
       while (i<array.length) {
		if(array[i]==i+1) {
			i++;
		}
		else return i+1;
	}
       return i+1;
	 }
	 
	 
	
}
