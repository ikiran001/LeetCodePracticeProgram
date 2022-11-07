import java.util.ArrayList;
import java.util.List;

public class Addition {

	private static List<Integer> addition(int[] nums) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				nums[i] = nums[i] + nums[j];

			}
			System.out.println(nums[i]);
			a.add(nums[i]);
		}
		return a;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 };
		List<Integer> a = addition(nums);
		System.out.println(a);

	}

}
