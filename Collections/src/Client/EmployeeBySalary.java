package Client;

import java.util.Comparator;

import Pozo.Employee;

public class EmployeeBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		return (int) (o1.getSalary()-o2.getSalary());
	}

}
