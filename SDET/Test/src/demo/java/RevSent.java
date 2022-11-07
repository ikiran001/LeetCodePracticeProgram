package demo.java;


public class RevSent {

	public static String rev(String n) {

		String[] revName = n.split("\\s");
		String outputString = "";
	
	//for (int i = 0; i < revName.length; i++) {
		
		for (int i = revName.length - 1; i >= 0; i--) {
			//System.out.println("revName : "+revName[i]);
			outputString = outputString + revName[i] + " ";
		}
		

		return outputString;
	}

	public static void main(String[] args) {

		String name = "Ganesh Abasaheb Kashid";

		System.out.println(rev(name));

	}

}
