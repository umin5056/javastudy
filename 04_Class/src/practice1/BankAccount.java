package practice1;

public class BankAccount {
	
	//필드
	private String accNo;
	private long balance;
	
	//생성자
	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}

	//메소드 (입금, 출금, 이체, 조회)
	
	// 입금 (마이너스 입금 불가)
	public void deposit(long money) {
		if(money > 0) {
			balance = balance + money;
		}
	}
	
	// 출금 (잔액보다 큰 출금, 마이너스 출금 불가) 
	public long withdrawal(long money) {
		
		if(money > balance || money <= 0) {
			return 0;
		}
		balance -= money;
		return money;
	}
	
	// 이체 
	
	public void transfer(BankAccount other, long money) {
			other.deposit(withdrawal(money));
	}
	
	// 조회
	public void innquiry() {
		System.out.println("계좌번호 : " + accNo);
		System.out.println("계좌잔액 : " + balance +  "원");
	}
	
}
