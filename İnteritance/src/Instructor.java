
public class Instructor extends User {

	String żnstructorPhoneNumber;

	
	//Instructor constructor
	
	public Instructor(int id, String userFirstName, String userLastName, String email, String branch,
			String instructorPhoneNumber) {
		super(id, userFirstName, userLastName, email, branch);
		żnstructorPhoneNumber = instructorPhoneNumber;
	}


   //żnstructor GetterandSetter
	
	public String getInstructorPhoneNumber() {
		return żnstructorPhoneNumber;
	}
	public void setInstructorPhoneNumber(String instructorPhoneNumber) {
		żnstructorPhoneNumber = instructorPhoneNumber;
	}
	
	
	
	
	
	
}
