package samplesStaples;

public class Employee {
	
	int age;
	String name;
	double salary;
	String designation;
	
	//create constrcutor
	
	public Employee(String name){
		this.name = name;
	}
	
	// Assign the age of the Employee  to the variable age
	public void empAge(int empAge){
		age = empAge;
	}
	
	
	public void empDesignation(String empDesignation){
		designation = empDesignation;
	}
	
	
	public void empSalary(double empSalary){
		salary = empSalary;
	}
	
public void prinEmployee (){
	
	System.out.println("Name:" + name);
	System.out.println("Age:" + age);
	System.out.println("Designation:" + designation);
	System.out.println("Salary:" + salary);
	
}
}
