package beans;

import javax.faces.bean.*;

// With @ManagedBean, this was failing with the runtime error 
// beans/User has been compiled by a more recent version of the Java Runtime (class file version 53.0), 
// this version of the Java Runtime only recognizes class file versions up to 52.0
//
// Because for some reason the compiler compliance level was set to 9 in the PROJECT SPECIFIC settings

@ManagedBean
@SessionScoped
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
