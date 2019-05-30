package in.ac.sharda;

public class DepertmentDemo {

	public static void main(String[] args) {
		Depertment d = new Depertment();
		for (int i = 1; i<30; i++) {
			d.addStudent(new Student(i,"Paul"+i));
		}
		d.addStudent(new Student(1, "Chika"));
		d.addStudent(new Student(1, "mr Paul"));
		
		d.printStudents();
		System.out.println("my name");
	}

}
