
public class Instructor extends User {

	String �nstructorPhoneNumber;

	
	//Instructor constructor
	
	public Instructor(int id, String userFirstName, String userLastName, String email, String branch,
			String instructorPhoneNumber) {
		super(id, userFirstName, userLastName, email, branch);
		�nstructorPhoneNumber = instructorPhoneNumber;
	}


   //�nstructor GetterandSetter
	
	public String getInstructorPhoneNumber() {
		return �nstructorPhoneNumber;
	}
	public void setInstructorPhoneNumber(String instructorPhoneNumber) {
		�nstructorPhoneNumber = instructorPhoneNumber;
	}
	
	
	
	
	
	
}
