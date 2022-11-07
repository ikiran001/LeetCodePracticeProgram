package comparable;

import java.util.Comparator;

public class NameSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		//return o1.getName().compareTo(o2.getName());
		return o1.getId() - o2.getId();
	}

	
}
