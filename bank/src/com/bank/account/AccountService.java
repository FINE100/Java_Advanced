package com.bank.account;

import java.util.Scanner;

public class AccountService {

	Scanner scn = new Scanner(System.in);
	//1. 계좌 개설
	//2. 입금,출금
	//3. 계좌 해지
	//4. 계좌 이체
	
	
	
	//1. 계좌 개설
	public void makeAccount() {
		
		Account ac = new Account();
		
		System.out.println("계좌 번호 > ");
		String accountId = scn.nextLine();
		System.out.println("고객 ID > ");
		String customtId = scn.nextLine();
		
		ac.setAccountId(accountId);
		ac.setMemberId(customtId);
		
		
	}
	
	//2. 입출금
	public void money() {
		
		Account account = new Account();
		
		System.out.println("1.입금 | 2. 출금 ");
		int cmd = Integer.parseInt(scn.nextLine());
		System.out.println("계좌번호 > ");
		String accountId = scn.nextLine();
		// 임금
		if(cmd == 1) {		
		System.out.println("입금 금액 > ");
	}
		// 출금
		else if(cmd == 2) {
			System.out.println("출금 금액 > ");
		}
		
		int money = Integer.parseInt(scn.nextLine());
		account.setAccountId(accountId);
		account.setBalance(money);
		
		int result = AccountManage.getInstance().updateMoney(account, cmd);
		
		if(result == 1 && cmd == 1) { // AccountManage의 입출금 기능 확인하면서 보기  
			System.out.println("입금 완료");
		} else if(result == 1 && cmd == 2) {
			System.out.println("출금 완료"); 				
			}
		}
	
	// 3. 계좌 해지 -> delete 
	public void deleteAccount() {
		System.out.println("======== 계좌 해지 =========");
		System.out.println("계좌 입력 > ");
		String accountId = scn.nextLine();
		
		int result = AccountManage.getInstance().delAccount(accountId);
		
		if(result == 1) {
			System.out.println("정상 해지");			
		}else {
			System.out.println("해지되지 않음");
		}
		
		
	}
	
	//4. 계좌이체
	
	// 1) 받는 사람 계좌
	// 2) 보내는 사람 계좌
	// 3) 보내는 사람 비밀번호(join) 또는 select 계좌와 비밀번호가 맞는지 
	// 4) 출금 금액
	// 데이터 유효성 검사.
	
	

	public void transfer() {
		System.out.println("======== 계좌 이체 =========");
		
		System.out.println("받는 사람 계좌");
		String ToAccountId = scn.nextLine();
		
		System.out.println("보내는 사람 계좌");
		String FromAccountId = scn.nextLine();
		
		System.out.println("출금 금액");		// 데이터 유효성 검사 필요
		int balance = Integer.parseInt(scn.nextLine());
		
		AccountManage.getInstance().transferMoney(ToAccountId, FromAccountId, balance);
		
		
	}
		
		
	
		
	
	}

