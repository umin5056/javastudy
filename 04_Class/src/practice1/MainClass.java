package practice1;

public class MainClass {

	public static void main(String[] args) {

		BankAccount myAcc = new BankAccount("1234-5678", 50_000);
		BankAccount yourAcc = new BankAccount("9876-5432", 100_000);
		
		myAcc.transfer(yourAcc, 20_000);
		
		myAcc.innquiry();
		yourAcc.innquiry();
	}

}
