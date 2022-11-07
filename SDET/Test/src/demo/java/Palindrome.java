package demo.java;

public class Palindrome {

	public static int palin(int no){
		
		int temp=0;
	     
		while (no!=0) {
			
			int rev =no%10;
			System.out.println("rev : "+rev);
			temp = (temp*10) +rev;
			no =no/10;
			System.out.println("no : "+no);
		}
		
	
		
		
		return temp;
	}
	
	public static void main(String[] args) {

		int i =8208;
		
		int r =palin(i);
		if (i==r) {
			System.out.println("palan");
		}else {
			System.out.println("not");
		}
		
		
	}

}
