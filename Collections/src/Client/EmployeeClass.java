package Client;

import java.time.LocalDate;
import java.util.*;


import Pozo.Employee;

public class EmployeeClass {

	Employee[] data = new Employee[5];
	
	public static void main(String[] args) {
		
		EmployeeClass empobj = new EmployeeClass();
		empobj.createObjects();
	}
  
	
  public void createObjects() {
  
	 
	  
	data[0]= new Employee("VRJ","N101",4471.71,LocalDate.parse("1996-10-15"));
	data[1]= new Employee("ARJ","R102",4471.71,LocalDate.parse("1976-01-05"));
	data[2]= new Employee("RSH","V103",1234.79,LocalDate.parse("1996-10-15"));
	data[3]= new Employee("NLN","N104",6777.87,LocalDate.parse("1796-08-12"));
	data[4]= new Employee("GRS","G105",4471.71,LocalDate.parse("1996-10-15"));
	//Arrays.sort(a, c);
  
  List<Employee> empdata = new ArrayList<Employee>();
  Employee[] tempdata;
  		/*for(int i=0;i<5;i++) {          DUMB WAY TO PUSH DATA INTO LIST
  			empdata.add(data[i]);}   
  */
  empdata=Arrays.asList(data);              /* SMART WAY TO PUSH DATA INTO LIST*/
  //tempdata=(Employee[]) empdata.toArray();
  
  //Arrays.sort(data);
  Arrays.sort(data, new EmployeeByAge());
  
  System.out.println("Sortin By Age-------------------------\n");
  for(Employee loop: data) {
  System.out.println("Sorted Data:"+loop.toString());
   }
  Arrays.sort(data, new EmployeeBySalary());
  System.out.println("Sortin By Salary-------------------------\n");
  for(Employee loop: data) {
	  System.out.println("Sorted Data:"+loop.toString());
	   }
  
  } 
  
  
  
  public void calculateAge() {
	  
  }
	
}
