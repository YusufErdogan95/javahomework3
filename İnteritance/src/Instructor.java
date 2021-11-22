
public class Instructor extends User {

	String ýnstructorPhoneNumber;

	
	//Instructor constructor
	
	public Instructor(int id, String userFirstName, String userLastName, String email, String branch,
			String instructorPhoneNumber) {
		super(id, userFirstName, userLastName, email, branch);
		ýnstructorPhoneNumber = instructorPhoneNumber;
	}


   //ýnstructor GetterandSetter
	
	public String getInstructorPhoneNumber() {
		return ýnstructorPhoneNumber;
	}
	public void setInstructorPhoneNumber(String instructorPhoneNumber) {
		ýnstructorPhoneNumber = instructorPhoneNumber;
	}
	
	
	
	
	
	
}
