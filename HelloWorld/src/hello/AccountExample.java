package hello;

import java.util.Scanner;

public class AccountExample {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("------------------------------------");
			int menu = sc.nextInt();
			if(menu==1) {
				createAccount();	
			} else if (menu==2) {
			   getAccountList();	
			} else if (menu==3) {
				    deposit();	
        	} else if (menu==4) {
        		withdraw();	      
		    } else if (menu==5) {
    	     	run= false;	      
	        }
			// 계좌인스턴스만드는 메소드.
	public static void createAccount() {
		System.out.println("createAccount");
		System.out.println("계좌입력:");
		String accountNo = sc.nextLine();
		System.out.println("사용자명 입력:");
		String accountName= sc.nextLine();
		System.out.println("첫계좌금액:");
		int accountBalance = sc.nextInt();
		Account accnt = new Account (accountNo,accountName,accountBalance);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = accnt;
				break;
			}
		}
		
	}
		
	}

	// 계좌리스트 조회하는 메소드.
	public static void getAccountList() {
		System.out.println("getAccountList");
		for(Account a : accountArray) {
			if(a.getAno()!=null && !a.getAno().equals(""));
			System.out.println("");
		}
		
	}
		
	}

	// 입금.
	public static void deposit() {
		System.out.println("deposit()");
		System.out.println("계좌번호입력:");
		String accntNo= sc.nextLine();
		System.out.println("입금액");
		int accntBalance= sc.nextInt();
		for(Account accnt : accountArray) {
			if(accnt != null && accnt.getAno().equals(accntNo)) {
				accnt.setBalance(accntBalance);
				
			}
		}

	}

	// 출금.
	public static void withdraw() {
		System.out.println("withdraw()");
		System.out.println("계좌번호입력:");
		String accntNo= sc.nextLine();
		System.out.println("출금액");
		int accntBalance= sc.nextInt();
		for(Account accnt : accountArray) {
			if(accnt != null && accnt.getAno().equals(accntNo)) {
				accnt.setBalance(-1*accntBalance);

	}

	public static Account findAccount(String ano) {
		return null;
	}

}
