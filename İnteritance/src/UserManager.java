
public class UserManager {

	   public void add(User user) {
		
		 System.out.println("Kullanýcý eklendi"+user.getId()+user.getUserFirstName()
		 +user.getUserLastName()+ user.getUserLastName()+user.getBranch());
	}
			
		 
	 public void remove(User user) {
				
		 System.out.println("Kullanýcý silindi"+" "+user.getId()+" "+user.getUserFirstName()
		+" " +user.getUserLastName()+" "+ user.getUserLastName()+" "+user.getBranch());
	 }
		 
		 public void update(User user) {
			 System.out.println("Kullanýcý güncellendi"+user.getUserFirstName()
			 +user.getUserLastName()+ user.getUserLastName()+user.getBranch());
			 
	}

		
		 
		 
		 
}
