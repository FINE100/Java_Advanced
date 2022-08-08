package com.bank.loan;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.bank.member.MemberService;

public class LoanService {
	Scanner scn = new Scanner(System.in); 
	//1. 대출 승인 
	//2. 대출 정보 변경
	// ==============
	//3. 상환
	//4. 대출 정보 조회 
	
	//1. 대출 승인 (은행원)
	public void insertLoan() {
		
		Loan loan = new Loan();
		
		System.out.println("대출 ID >> ");
		String loanId = scn.nextLine();
		System.out.println("회원 ID >> ");
		String memberId = scn.nextLine();
		System.out.println("대출 금액 >> ");
		int loanMoney= Integer.parseInt(scn.nextLine());
		System.out.println("대출 날짜 >> ");
		
		// 날짜의 경우 변환 + 예외처리 필요함.
		String startDay = scn.nextLine();		
		Date date = null;
	
				
		System.out.println("대출 상태 >> ");
		String state = scn.nextLine();
		
		loan.setLoanId(loanId);
		loan.setMemberId(memberId);
		loan.setLoanMoney(loanMoney);
		loan.setState(state);
		loan.setLoanDate(startDay);
		
		
		int result = LoanManage.getInstance().insertLoan(loan);
		if(result == 1) {
			System.out.println("대출 완료");
		}else {
			System.out.println("대출 실패");
		}
	}
	
	
	//2. 대출 정보 변경 (은행원)
	public void updateLoan() {
		Loan loan = new Loan();		
		System.out.println("대출 ID >> ");
		String loanId = scn.nextLine();
		System.out.println("상태 변경 >> ");
		String state = scn.nextLine();
		
		loan.setLoanId(loanId);
		loan.setState(state);
		
		int result = LoanManage.getInstance().updateLoan(loan);
		if(result == 1) {
			System.out.println("상태 변경 완료");
		}else {
			System.out.println("상태 변경 실패");
		}
	}
	//3. 상환 (사용자)
	public void updateMoney() {
		Loan loan = new Loan();
		System.out.println("대출 ID >> ");
		String loanId = scn.nextLine();
		
		System.out.println("상환 금액 >> ");
		int loanMoney = Integer.parseInt(scn.nextLine());
		
		loan.setLoanId(loanId);
		loan.setLoanMoney(loanMoney);
		
		int result = LoanManage.getInstance().updateMoney(loan);
		if(result == 1) {
			System.out.println("상환 완료");
		} else {
			System.out.println("상환 실패");
		}
	}
	
	//4. 대출 정보 조회(사용자)_ 이미 로그인 되어 있는 상황
	public void loanInfO() {
		// 로그인에 사용된 회원 ID를 가지고 오면, 해당 회원 정보 조회가 되므로 가져옴
	//  memberInfo는 static이라 전역에서 사용 가능 
		List<Loan> list = 
				LoanManage.getInstance().getLoanInfo(MemberService.memberInfo.getMemberId());
		System.out.print(MemberService.memberInfo.getMemberName() + "님의 대출 정보");
		
		for(Loan loan : list) {
			//대출 ID, 대출 금액, 대출 날짜
			System.out.println("대출 ID : " + loan.getLoanId());
			System.out.println("대출 금액 : " + loan.getLoanMoney());
			System.out.println("대출 날짜 : " + loan.getLoanDate());
			
			
		}
	}
	
	
	
	

}
