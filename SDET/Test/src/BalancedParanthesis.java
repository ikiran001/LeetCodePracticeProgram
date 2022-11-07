import java.util.Stack;


public class BalancedParanthesis {
	public static void main(String[] args) {
	 final String input1 = "{()}";
	    System.out.println("Checking balanced paranthesis for input:" + input1);
	 
	    if (isBalanced(input1)) {
	      System.out.println("Given String is balanced");
	    } else {
	      System.out.println("Given String is not balanced");
	    }
	  }
	 
	  /**
	   * function to check if a string has balanced parentheses or not
	   * @param input_string the input string
	   * @return if the string has balanced parentheses or not
	   */
	  private static boolean isBalanced(String input_string) {
	 
	    Stack<Character> stack = new Stack<>();
	 
	    for (int i = 0; i < input_string.length(); i++) {
	 
	      switch (input_string.charAt(i)) {
	        case '[':
	        case '(':
	        case '{':
	          stack.push(input_string.charAt(i));
	          break;
	          
	          
	          
	        case ']':
	          if (stack.empty() || !stack.pop().equals('[')) {   
	            return false;
	          }
	          break;
	        case '}':
	          if (stack.empty() || !stack.pop().equals('{')) {
	            return false;
	          }
	          break;
	        case ')':
	          if (stack.empty() || !stack.pop().equals('(')) {
	            return false;
	          }
	          break;
	      }
	    }
	    return stack.empty();
	  }

}
