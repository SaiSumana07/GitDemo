package Inhertiance;

public class Inbox extends Login {
	
	//Hierarchical inheritance
	
	public void inbox() {
		System.out.println("You have 50 unread mails");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inbox i = new Inbox();
		i.login();
		i.inbox();
		
	}

}
