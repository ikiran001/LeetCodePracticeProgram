package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(1, "atu"));
		employees.add(new Employee(4, "omjeet"));
		employees.add(new Employee(2, "prasad"));
		employees.add(new Employee(2, "prasad"));
		employees.add(new Employee(2, "x"));
		
		System.out.println(employees);
		
		Collections.sort(employees , new NameSort());
		
		System.out.println(employees);

	}

}
