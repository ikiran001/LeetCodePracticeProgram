package HackerRank;

public class CamleCase {

	public static void main(String[] args) {
		String s="saveChangesInTheEditor";
		System.out.println(camelcase(s));

	}
	public static int camelcase(String s) {
		String series="";
		int count=1;
		for (int i = 0; i < 26; i++) {
			series+=(char)('A'+i);
		}
		for (int i = 0; i < s.length(); i++) {
			if(series.contains(String.valueOf(s.charAt(i)))){
				count++;	
			}
		}return count;
	}
}
