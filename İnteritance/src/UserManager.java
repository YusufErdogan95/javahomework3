
public class UserManager {

	   public void add(User user) {
		
		 System.out.println("Kullanıcı eklendi"+user.getId()+user.getUserFirstName()
		 +user.getUserLastName()+ user.getUserLastName()+user.getBranch());
	}
			
		 
	 public void remove(User user) {
				
		 System.out.println("Kullanıcı silindi"+" "+user.getId()+" "+user.getUserFirstName()
		+" " +user.getUserLastName()+" "+ user.getUserLastName()+" "+user.getBranch());
	 }
		 
		 public void update(User user) {
			 System.out.println("Kullanıcı güncellendi"+user.getUserFirstName()
			 +user.getUserLastName()+ user.getUserLastName()+user.getBranch());
			 
	}

		
		 
		 
		 
}
