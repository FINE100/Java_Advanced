package com.bank.app;

import java.util.Scanner;

import com.bank.account.AccountService;
import com.bank.member.MemberService;

public class ManageMent {
	Scanner scn = new Scanner(System.in);
	
	MemberService ms = new MemberService();
	AccountService as = new AccountService();
	
	int menuNo = 0;

	public ManageMent() {

		bankjob();
	}

	private void bankjob() {
		menuInfo();
		while (true) {
			if (MemberService.memberInfo.getRole().endsWith("1")) {
				if (menuNo == 1) {
					//  고객 등록
					ms.registCustomer();					
				} else if (menuNo == 2) {
					// 계좌 개설 
					as.makeAccount();					
				} else if (menuNo == 3) {
					// 입출금
					as.money();

				} else if (menuNo == 4) {
					// 계좌 이체
					as.transfer();			

				} else if (menuNo == 5) {
					as.deleteAccount();
				} else if (menuNo == 6) {
				}		

			} else if (MemberService.memberInfo.getRole().endsWith("0")) {

		
			}
		}

	}

	private void menuInfo() {
		/*
		 * 은행원 - 고객 등록 - 계좌 개설 - 입출금, 이체 - 계좌 해지 (=삭제) - 대출 (조건 : 금리 따지지 않음) 1) 대출승인 2)
		 * 대출 상태 변경
		 * 
		 * 2) 사용자 - 계좌 조회 - 입금 - 출금 - 이체 - 대출 -> 1. 상환 2. 조회
		 * 
		 */
		if (MemberService.memberInfo.getRole().equals("1")) {
			System.out.println("1. 고객 등록 | 2. 계좌 개설 | 3. 입출금 | 4. 계좌이체 | " + "5. 계좌 해지 | 6. 대출");

		} else if (MemberService.memberInfo.getRole().equals("0")) {
			System.out.println("1. 계좌 조회 | 2.입금 | 3. 출금 | 4. 이체 | 5. 대출 ");
		}
		System.out.println(" 입력 > ");
		menuNo = Integer.parseInt(scn.nextLine());

	}

}
