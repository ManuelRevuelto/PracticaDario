package DI2021.Discoteca.models;

public class Usuario {
	
	private String name;
	private String email;
	private String password;

	public Usuario(String name, String email, String password) {
		this.setPassword(password);
		this.email = email;
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString() {
		return "The user is: " + this.name + ", " + email + " : " + this.password;
	}
	
}
