package com.bank.app;

import java.util.Scanner;

import com.bank.account.AccountService;
import com.bank.loan.LoanService;
import com.bank.member.MemberService;

public class ManageMent {
	Scanner scn = new Scanner(System.in);

	MemberService ms = new MemberService();
	AccountService as = new AccountService();
	LoanService ls = new LoanService();

	int menuNo = 0;

	public ManageMent() {

		bankjob();
	}

	private void bankjob() {
		while (true) {
			menuInfo();
			
			// 은행원 
			if (MemberService.memberInfo.getRole().endsWith("1")) {
				if (menuNo == 1) {
					// 고객 등록
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
					// 계좌 삭제
				} else if (menuNo == 5) {
					as.deleteAccount();
					// 대출 
				} else if (menuNo == 6) {
					System.out.println("1. 대출 승인 | 2. 대출 정보 변경");
					int menu = Integer.parseInt(scn.nextLine());
					if(menu == 1) {
						// 대출 승인
						ls.insertLoan();
					} else if (menu == 2) {
						ls.updateLoan();
					}
					
				}

			} 
			// 일반 고객 
			else if (MemberService.memberInfo.getRole().endsWith("0")) {
				if(menuNo == 1) {
					as.getAccount();					
				}else if(menuNo == 2) {
					as.money();
				
			}else if(menuNo == 3) {
				as.transfer();
						
		} else if(menuNo == 4) {
			// 1) 상환 -> update
			// 2) 대출 조회 -> select
			System.out.println("1. 상환 | 2. 대출 조회 ");
			int menu = Integer.parseInt(scn.nextLine());
			// 상환
			if(menu == 1) {
				ls.updateMoney();
			}
			//  대출 조회
			else if (menu == 2) {
				ls.loanInfO();
			}
		}
			
		}
			

	}
		}

	private void menuInfo() {
		// role == 1, 은행원(관리자)
		if (MemberService.memberInfo.getRole().equals("1")) {
			System.out.println("1. 고객 등록 | 2. 계좌 개설 | 3. 입출금 | 4. 계좌이체 | " + "5. 계좌 해지 | 6. 대출");
			// role == 0, 일반 사용자
		} else if (MemberService.memberInfo.getRole().equals("0")) {
			System.out.println("1. 계좌 조회 | 2.입출금 | 3. 이체 | 4. 대출 ");
		}
		System.out.println(" 입력 > ");
		menuNo = Integer.parseInt(scn.nextLine());

	}

}
