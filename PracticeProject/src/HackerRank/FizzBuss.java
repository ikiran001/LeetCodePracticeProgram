package HackerRank;
// Reverse the arrayList
import java.util.ArrayList;
import java.util.List;

public class FizzBuss {

	public static void main(String[] args) {
		int[] arr= {1,2,3};


	}
	public static List<Integer> reverseArray(List<Integer> a) {
		List<Integer> list=new ArrayList<>();
		for (int i = a.size()-1; i > 0; i--) {
			list.add(a.get(i));
		}
		return list;
	}



}
