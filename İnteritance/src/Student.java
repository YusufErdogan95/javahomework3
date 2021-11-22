



public class Student  extends User{

	private int studentNo;
	private String level;
	
	//Student Constructor
	public Student(int id, String userFirstName, String userLastName,
			String email, String branch, int studentNo,String level) {
		
		super(id, userFirstName, userLastName, email, branch);
		this.studentNo = studentNo;
		this.level = level;
	}
	
	//student GetterandSetter
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	
	
	
}
