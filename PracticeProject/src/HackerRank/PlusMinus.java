package HackerRank;

public class PlusMinus {

	public static void main(String[] args) {
		int [] arr= {-4, 3, -9, 0, 4, 1};

		plusMinus(arr);


	}
	public static void plusMinus(int[] arr) {
		int n=arr.length;
		double zero=0.0;
		double pos=0.0;
		double neg=0.0;
		for (int i=0 ;i<n;i++) {
			if(arr[i]==0){
				zero++;
			}
			if(arr[i]>0){
				pos++;
			}
			if(arr[i]<0){
				neg++;
			}
		}
		System.out.printf("%.6f",zero/n);
		System.out.println();
		System.out.printf("%.6f",pos/n);
		System.out.println();
		System.out.printf("%.6f",neg/n);
	}

}
