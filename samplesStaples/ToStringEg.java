package samplesStaples;

public class ToStringEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj = new Student(15, "John");
		{
		System.out.println(obj);
		}

	}

}

class Student {
	int RollNo;
	String Name;
	
	public Student(int rollNo, String name) {
		super();
		RollNo = rollNo;
		Name = name;
	}

	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", Name=" + Name + "]";
	}
	
	
}
