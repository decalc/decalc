package in.ac.sharda;

public class Student {

	private int RollNumber;
	private String name;
	private String email;

	public Student(int rn, String n) {
		this.RollNumber = rn;
		this.name = n;
	}

	public void student(int rn, String n, String e) {
		this.RollNumber = rn;
		this.name = n;
		this.email = e;
	}

	public int setRollnumber(int rn) {
		return RollNumber = rn;
	}

	public String getEmail() {
		return email;
	

	}public int getrollnumber() {
		return RollNumber;
	}

	public String getName() {
		return name;
	}

	public void Attendance() {
		System.out.println("Attendance Present");
	}

}
