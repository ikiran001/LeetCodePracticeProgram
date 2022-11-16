package LeetCodeArrays;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
/*Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.*/
public class LeetCode_BS_744 {

	public static void main(String[] args) {
char [] arr= {'c','f','j'};
char target='g';
nextGreatestLetter(arr, target);
System.out.println(nextGreatestLetter(arr, target));

	}
	   static char nextGreatestLetter(char[] letters, char target) {
			int start=0;
			int end = letters.length-1;

			

			while(start<=end) {
				int mid =start+(end-start)/2;
				if(target<letters[mid]) {
					
	              end=mid-1;
				}
				else {
					start=mid+1;

				}
				

			}
			return letters[start%letters.length];
		}
}
