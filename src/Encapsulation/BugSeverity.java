package Encapsulation;

public class BugSeverity {
	
	private String severity;
	
	//setter method
	public void setSeverity(String sev) {
		if(sev.equals("Low") || sev.equals("Medium") || sev.equals("Critical")) {
			this.severity=sev;
			System.out.println(severity);
		}
		else {
			System.out.println("Invalid severity");
		}
	}
	
	public String getSeverity() {
		return severity;
	}

}
