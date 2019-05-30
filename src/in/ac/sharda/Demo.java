package in.ac.sharda;

public class Demo {

	public static void main(String[] args) {
		Student s2 = new Student (2, "Chika");
		Student s = new Student(1, "Paul");
		System.out.println(s.getRollnumber());
		System.out.println(s.getName());
		System.out.println(s.getEmail());
	}

}
