
public class UserManager {

	   public void add(User user) {
		
		 System.out.println("Kullan�c� eklendi"+user.getId()+user.getUserFirstName()
		 +user.getUserLastName()+ user.getUserLastName()+user.getBranch());
	}
			
		 
	 public void remove(User user) {
				
		 System.out.println("Kullan�c� silindi"+" "+user.getId()+" "+user.getUserFirstName()
		+" " +user.getUserLastName()+" "+ user.getUserLastName()+" "+user.getBranch());
	 }
		 
		 public void update(User user) {
			 System.out.println("Kullan�c� g�ncellendi"+user.getUserFirstName()
			 +user.getUserLastName()+ user.getUserLastName()+user.getBranch());
			 
	}

		
		 
		 
		 
}
