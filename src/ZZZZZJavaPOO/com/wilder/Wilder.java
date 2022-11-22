package ZZZZZJavaPOO.com.wilder;

public class Wilder {

	private String firstname;
	private boolean aware = false;
	
	public Wilder() {}
	public Wilder(String firstname, boolean aware) {
		this.firstname = firstname;
		this.aware = aware;
	}
	
	public String WhoIAm() {
		
		String message;
		if (this.isAware() == true) {
			this.setFirstname("Jean-Claude");
			message = "Je m'appelle " + this.getFirstname() + " et je suis aware";
		} else {
			this.setFirstname("Henri");
			message = "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
		}
		
		return message;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public boolean isAware() {
		return aware;
	}

	public void setAware(boolean aware) {
		this.aware = aware;
	}
}
