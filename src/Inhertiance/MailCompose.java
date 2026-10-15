package Inhertiance;

public class MailCompose extends Login{
	
	//hierarchial inheritance
	
	public void compose() {
		System.out.println("Mail compose page");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MailCompose c=new MailCompose();
		c.login();
		c.compose();
	}

}
