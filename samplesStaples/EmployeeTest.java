package samplesStaples;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee Employe1 = new Employee("Ram");
		Employee Employe2 = new Employee("John");
		
		
		Employe1.empAge(21);
		Employe1.empDesignation("SE");
		Employe1.empSalary(100000.00);
		Employe1.prinEmployee();

		
		Employe2.empAge(30);
		Employe2.empDesignation("PE");
		Employe2.empSalary(120000.00);
		Employe2.prinEmployee();
	}

}
