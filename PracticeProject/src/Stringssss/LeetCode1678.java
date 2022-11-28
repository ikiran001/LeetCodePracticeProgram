package Stringssss;

public class LeetCode1678 {

	public static void main(String[] args) {
		String command = "G()(al)";
		System.out.println(interpret(command));

	}

	   static String interpret(String command) {
	       String a=   command.replace("()", "o");
		      String b=a.replace("(", "");
		      String c=b.replace(")", "");
		      return c;
	      
	    }
}
