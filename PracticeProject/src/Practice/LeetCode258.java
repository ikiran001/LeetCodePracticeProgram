package Practice;

public class LeetCode258 {

	public static void main(String[] args) {
		int a=38;
		System.out.println(addDigits(a));

	}

	static int addDigits(int num) {
		int length=(int)Math.log10(num);

		while(length>0 && num>0) {
			int sum=0;
			while(num>0) {
				int modulo=num%10;
				sum+=modulo;
				num=num/10;
			}
			num=sum;
			length=(int)Math.log10(num);

		}
		return num;
	}

}
