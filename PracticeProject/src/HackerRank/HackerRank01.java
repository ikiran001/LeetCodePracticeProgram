package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class HackerRank01 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(10);list.add(11);
	System.out.println(simpleArraySum(list));
	}

	public static int simpleArraySum(List<Integer> ar) {
		int Result=0;
		for (int i = 0; i < ar.size(); i++) {
			Result= Result+   (ar.get(i));
		}
		return Result;

	}

}
