
public class User {

	private int id;
	private String userFirstName;
	private String userLastName;
	private String email;
	private String branch;
	
	//User constructor
	public User(int id, String userFirstName, String userLastName, String email, String branch) {
		super();
		this.id = id;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.email = email;
		this.branch = branch;
	}

	
	//userGetterandSetter

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserFirstName() {
		return userFirstName;
	}


	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}


	public String getUserLastName() {
		return userLastName;
	}


	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
	
	
	
	
}
