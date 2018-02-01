package samplesStaples;

public class EncapsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Emp e1 = new Emp();
       
       e1.setEmpid(1);
       e1.setEmpname("MMK");
       //e1.empid = 1;
      // e1.empname= "MMK";
       
      System.out.println(e1.getEmpid());
      System.out.println(e1.getEmpname());
	}
 
}

class Emp {
	
	private String empname;
	private int empid;
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
}