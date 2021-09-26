package beans;

// import javax.faces.bean.*;

// @ManagedBean
// @SessionScoped
public class User {
	
	String firstName;
	String lastName;
	
	public User() {
		// TODO Auto-generated constructor stub
		setFirstName("Eric");
		setLastName("Jones");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
