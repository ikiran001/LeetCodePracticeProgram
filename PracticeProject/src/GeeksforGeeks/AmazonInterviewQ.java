package GeeksforGeeks;
//find the index of an element from sorted infinite array
//amazon inteview question

public class AmazonInterviewQ {

	public static void main(String[] args) {
		int [] arr={3,5,7,9,10,90,100,130,140,160,170};

		System.out.println(ans(arr, 10));
	}
	static int ans(int [] arr, int target) {
		int start=0;
		int end=1;
		while(target>arr[end]) {
			int temp=end+1;
			end=end+(end-start+1)*2;
			start=temp;

		}
		return indexofanArray(arr, target, start, end);
	}


	static int indexofanArray(int [] arr, int target , int start , int end) {
		while(start<=end){
			int mid=start+(end-start)/2;
			if(target>arr[mid]) {
				start=mid+1;
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

}
