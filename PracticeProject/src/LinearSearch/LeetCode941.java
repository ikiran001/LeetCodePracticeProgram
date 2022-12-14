package LinearSearch;

public class LeetCode941 {

	public static void main(String[] args) {
		int [] arr= {0,1,2,4,2,1};
		System.out.println(validMountainArray(arr));

	}

	public static boolean validMountainArray(int[] arr) {
		
		
		int peak=peakElement(arr);
		if(peak==arr.length-1 || peak==0) {
			return false;
		}

		if(arr.length<3) {
			return false;
		}


		return isAss(arr) && isDes(arr);
	}


	static int peakElement(int [] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1]) {
				end=mid;	 
			}
			else start=mid+1;
		}
		return start;
	}



	static boolean isAss(int [] arr) {
		int peak= peakElement(arr);
		int i=0;
		while(i<peak) {
			if(arr[i]<arr[i+1]) {
				i++;
			}
			else {
				return false;
			}
		}
		return true;
	}



	static boolean isDes(int [] arr) {
		int peak= peakElement(arr);
		while(peak<arr.length-1) {
			if(arr[peak]>arr[peak+1]) {
				peak++;
			}
			else {	return false;}
		}
		return  true;
	}
}


