package Pozo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
FileName:Employee.java
AuthorName:NRJ
Description: EmployeePoZo
Written Date : 17th OCTOBER 2018

*/


public class Employee  implements Comparable<Employee>{
  
	private String name;
	private String id;
	private double salary;
	private LocalDate dob;
	
	
	
	//--------------constructors------------------
	
	 

	public Employee() {}
	
	
	/**
	 * @param name
	 * @param id
	 * @param salary
	 * @param dob
	 */
	public Employee(String name, String id, double salary, LocalDate dob) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.dob = dob;
	}


//============================================================	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	//==================================================

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}


	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}


	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}


	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	@Override
	public int compareTo(Employee o) {  //this is Comparable's method both are part of Comparable Interface
		// TODO Auto-generated method stub
		//this.salary-o.salary;
	/*	if(this.salary==(o.salary))
		{
			return this.name.compareTo(o.name);
		}
		int round = (int) Math.round(this.salary-(o.salary));
	*/
		if(this.dob.equals(o.dob))
		{
			return this.name.compareTo(o.name);
		}
		return this.dob.compareTo(o.dob);  // this string class's method which returns (int) 
	}
	
	
	public String toString() {
		return " IDs:" +this.id+"  Names :"+this.name+" Salary: "+this.salary+" Date:"+this.dob;
	}
	
	
	
	

}
