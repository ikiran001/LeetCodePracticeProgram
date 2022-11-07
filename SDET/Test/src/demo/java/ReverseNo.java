package demo.java;

public class ReverseNo {
	public static int rev(int no) {

           int reverse =0;
           
           while (no != 0) {
			
        	   int temp = no%10;
        	   System.out.println("temp : "+temp);
        	   reverse = reverse*10+temp;
        	   System.out.println("reverse : "+reverse);
        	   no =no/10;
        	   
		}
           
           
           return reverse;
		
	}

	public static void main(String[] args) {
		int a = 1234;

		//rev(a);
		System.out.println(rev(a));
	}

}
