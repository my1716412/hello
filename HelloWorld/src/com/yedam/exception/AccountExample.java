package com.yedam.exception;

class AccountExample {
	private long balance;
	public void Account() {		
	}
	public long getBalance() {
		return balance;
	}
	public void deposit(int money ) {
		balance += money;
	}
	public void withdraw(int money) throws BalenceInsufficienException {
		if(balance<money) {
			throw new BalenceInsufficienException("잔고부족 : " + (money - balance) + "모자랍니다.");
		}
		balance -= money;		
	}
}


