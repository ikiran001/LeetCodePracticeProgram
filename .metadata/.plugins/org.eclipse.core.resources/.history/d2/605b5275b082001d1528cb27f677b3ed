package LeetCodeArrays;

public class leetCode771 {

	public static void main(String[] args) {
	String	jewels = "z"; 
	String stones = "ZZ";
	System.out.println(numJewelsInStones(jewels, stones));

	}
	public  static int numJewelsInStones(String jewels, String stones) {
		int i=0;
		int count=0;
		while(i<stones.length()) {
			if(jewels.contains(String.valueOf(stones.charAt(i)))) {
				count++;
				i++;
			}
			else {i++;}
		}
		return count;
	}

}
