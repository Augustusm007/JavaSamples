package serialization;

public class Student {
	
	private int Rollno;
	private String Sname;
	
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", Sname=" + Sname + "]";
	}

	
}
