package Stringssss;
//https://leetcode.com/problems/sorting-the-sentence/
//1859. Sorting the Sentence

//arrange the sentenced according to the numbers
//remove the numbers
//and save it to the new string 
public class LeetCode1859 {

	public static void main(String[] args) {
		String	 s = "is2 sentence4 This1 a3";
		System.out.println(sortSentence(s));
	}

	static String sortSentence(String s) {
		String a="";
		String[] args=s.split(" ");
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args.length; j++) {
				if(args[j].contains(String.valueOf(i+1))) {
					a+=args[j]+" ";
					break;
				}
			}
		}
		String[] b=a.split(" ");
		for (int i = 0; i < b.length; i++) {
			for (int j = 1; j <=b.length; j++) {
				if(b[i].contains(String.valueOf(j))){
					b[i]=b[i].replace(String.valueOf(j), "");
				}
			}

		}
		String c="";
		for (int i = 0; i < b.length; i++) {
			c+=b[i]+" ";
		}


		return c.trim();
	}

}
