package Practice;

import java.util.ArrayList;
import java.util.List;

public class ListArraylist {

	public static void main(String[] args) {

		List<Integer> a= new ArrayList<>();
		List<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 5; i++) {
			a.add(i);
			
			list.add(new ArrayList(a));
		}
		
		System.out.println(list);
	}

}
