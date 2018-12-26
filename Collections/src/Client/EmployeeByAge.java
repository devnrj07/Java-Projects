package Client;

import java.util.Comparator;

import Pozo.Employee;

public class EmployeeByAge implements Comparator<Employee> {

	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		
		
		return o1.getDob().compareTo(o2.getDob());
	}

	
	
	
}
