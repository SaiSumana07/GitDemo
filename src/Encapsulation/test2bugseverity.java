package Encapsulation;

public class test2bugseverity {
	
	public static void main(String[] args) {
		BugSeverity b = new BugSeverity();
		//b.severity="ajhakh";
		b.setSeverity("sjhkshj");
		b.getSeverity();
	}

}
