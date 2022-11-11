package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class HackerRank03 {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		list.add(3);list.add(2);list.add(1);list.add(3);list.add(11);list.add(11);list.add(11);
		System.out.println(birthdayCakeCandles(list));

	}
	public static int birthdayCakeCandles(List<Integer> candles) {
		int max=0;
		int count=0;
		for (int i = 0; i < candles.size(); i++) {
			if(candles.get(i)>max) {
				max=candles.get(i);
			}
		}
		for (int i = 0; i < candles.size(); i++) {
			if(max==candles.get(i)) {
				count++;
			}
		}

		return count;
	}

}
