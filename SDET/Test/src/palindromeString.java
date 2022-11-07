public class palindromeString {

	public static void main(String[] args) {

		String name = "nistin";
		String temp = name;
		String a="";
		for (int i = name.length()-1; i >= 0 ; i--) {
			
			//System.out.print(name.charAt(i));
			
			char ch = name.charAt(i);
			
			a= a+ch;
			//System.out.println("a :"+a);
			
			if (temp.equals(a) ) {
				System.out.println("Done");
			}
			//System.out.println(a);
		}
		
	}

}
