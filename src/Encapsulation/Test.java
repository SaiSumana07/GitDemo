package Encapsulation;

public class Test {
	
	//encapsulation

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bal=new BankAccount();
		//System.out.println(bal.balance); dont work as balance is private
		bal.setBalance(100000);
		System.out.println(bal.getBalance());

	}

}
