package in.ac.sharda;

import java.util.ArrayList;
import java.util.List;

public class Depertment {
	private List<Student> Students = new ArrayList<>();

	public void addStudent(Student student) {
		Students.add(student);
	}
	public void printStudents() {
		Students.parallelStream()
		.forEach(
				s-> System.out.println(s.getrollnumber()));
	}
	public int getid() {
		return id;
	}
	@Override 
	public boolean equals(Object obj) {
		if(obj instaceof Depertment) {
			return(Depertment(obj))
		
		}
	}return false;

}
