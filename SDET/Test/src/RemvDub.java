import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemvDub {

	public static void main(String[] args) {

		List<Integer> aList = Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5,
				5);

		Set<Integer> hSet = new HashSet<Integer>(aList);

		for (Integer d : hSet) {
			System.out.println(d);

		}

	}

}
