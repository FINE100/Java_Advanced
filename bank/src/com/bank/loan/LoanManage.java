package com.bank.loan;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.bank.common.DAO;

public class LoanManage extends DAO {

	// 전역에서 사용하기 위해 static 사용
	private static LoanManage loanManage = null;

	private LoanManage() {

	}

	// 메모리 로스를 줄이기 위해 이 형태로 작성
	public static LoanManage getInstance() {
		if (loanManage == null) {
			loanManage = new LoanManage();
		}
		return loanManage;
	}

	// 1. 은행원 : 대출 ->
	// 1) 대출 승인 : insert
	public int insertLoan(Loan loan) {
		int result = 0;
		try {
			conn();
			String sql = "insert into Loan values (?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loan.getLoanId());
			pstmt.setString(2, loan.getMemberId());
			pstmt.setString(3, loan.getLoanDate());
			pstmt.setString(4, loan.getState());
			pstmt.setInt(5, loan.getLoanMoney());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 2) 대출 정보 변경(y,n) : update
	public int updateLoan(Loan loan) {
		int result = 0;
		try {
			conn();
			String sql = "update loan set state = ? where loan_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loan.getState());
			pstmt.setString(2, loan.getLoanId());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 2. 일반고객 : 대출 ->
	// 1) 상환 : update

	public int updateMoney(Loan loan) {
		int result = 0;
		try {
			conn();
			String sql = "update loan set loan_money= loan_money - ? where loan_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, loan.getLoanMoney());
			pstmt.setString(2, loan.getLoanId());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result; 
	}
	
	// 2) 대출조회 : select
	// loan table column loan_money
		
   // 고객 이름, 대출 id, 대출 금액, 대출 날짜 
   // join 

	public List<Loan> getLoanInfo(String memberId) {
		List<Loan> list = new ArrayList<Loan>();
		Loan loan1 = null;
		try {
			conn();
			String sql = "select b.member_name member_name, l.loan_id loan_id, \r\n"
					+ "        l.loan_money loan_money, l.loan_date loan_date\r\n" 
					+ "from bankmember b join loan l\r\n"
					+ "on b.member_id = l.member_id\r\n" 
					+ "where b.member_id = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//member_name ( 기존에 없었으므로 필드 추가 getter setter 추가 해주기 )
				//loan_id
				//loan_money
				//loan_date
				loan1 = new Loan();
				loan1.setMemberName(rs.getString("member_name"));
				loan1.setLoanId(rs.getString("loan_id"));
				loan1.setLoanMoney(rs.getInt("loan_money"));
				loan1.setLoanDate(rs.getString("loan_date"));
				
				list.add(loan1);
				
			}
			
		} catch (Exception e) {

		} finally {
			disconnect();
		}
		return list;

	}
}
