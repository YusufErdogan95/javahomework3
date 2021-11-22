
public class Main {

	public static void main(String[] args) {
		
		 User user = new User(1, "yusuf", "Erd", "ysf@gmail.com", "software");
		 
		 Instructor instructor = new Instructor(2, "engin", "demiroğ",
				 "engin@gmail.com", "java", "0123456789");
		 
		 Student student = new Student(3, "ahmet", "anı", "ahmet@gmail.com",
				 "c#",1234 , "junior");

		 
		
		 UserManager userManager = new UserManager ();
		 userManager.add(user);
		 userManager.remove(student);
		 userManager.update(instructor);
		 
		
		 
	}

}
