package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;		

public class TestC {

		public static void main(String[] args) {
		
			
			List <Student> C = new ArrayList<> ();
			C.add(new Student(1,20));
			C.add(new Student(2,25));
			C.add(new Student(3,23));
       Collections.sort(C);
for (Student S:C){
	
	System.out.println(S);
}
//		C.add(502);
//		C.add(701);
//		C.add(300);
//		Comparator<Integer> Cr = new Comimpl();
//		Collections.sort(C,Cr);
//		C.forEach(System.out::println);
//		
		
		
//		for (Object i : C) {
//			System.out.println(i);
//		}
			
		
	}

}

class Student implements Comparable<Student> {
	int RollNo;
	int marks;
	public Student(int rollNo, int marks) {
		RollNo = rollNo;
		this.marks = marks;
	}
	
	  public int compareTo(Student s) {
		  return this.marks>s.marks?-1:this.marks<s.marks?1:0;
	  }
	
	
	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", marks=" + marks + "]";
	}
	

	
}
