package Assig2_3;
import java.util.Scanner;
class Employee{
	
	private int id;
	private String name;
	private	float salary;
	public Employee(int id,String name, float salary){
		this.id  = id;
		this.name=name;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class SortEmployeeBySalary {
	
	public static void sortEmployeeBySalary(Employee []emp) 
	{
		for(int i=1;i<emp.length;i++) {
			Employee temp = emp[i];
			int j=i-1;
			for( ;i>=0; j--) 
			{
				if(emp[j].getSalary() > temp.getSalary()) {
					emp[j+1] = emp[j];
				}
				else {
					break;
				}
			}
			emp[j+1] = temp;
		}
		
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Employee []listEmployee = {
			new Employee(1,"Sourabh",1000),
			new Employee(4,"Vishal",7000),
			new Employee(5,"Average Andy",4000),
			new Employee(3,"Shree",2000),
			new Employee(2,"Ketan",5000)			
	};
	System.out.println("Array before sorting: ");
	for(Employee emp : listEmployee) {
		System.out.println(emp.toString());
	}
	sortEmployeeBySalary(listEmployee);
	System.out.println("Array after sorting: ");
	for(Employee emp : listEmployee) {
		System.out.println(emp.toString());
	}
	
	

}
}
