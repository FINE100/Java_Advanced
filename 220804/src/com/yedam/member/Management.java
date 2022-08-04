package com.yedam.member;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO; // 다른 패키지에 DAO가 있어서 import 해줘야함

//DAO를 상속 받아서 메소드 사용
public class Management extends DAO{ 
	
	
	public Management() {
		// 전체 조회 
		showInfo();
		// 한건 조회
		getMember();
		// 한건 입력 
		insertInfo();
		// 수정
		UpdateInfo();
		// 삭제
		deleteInfo();
		
	} 
	private void deleteInfo() {
		int result = 0; 
		try {
			
			conn();
			String sql = "delete from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "A");
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		if(result == 1) {
			System.out.println(result + "건이 삭제되었습니다.");
		} else {
			System.out.println("삭제 되지 않았습니다.");
		}
		
	}
	//수정
	private void UpdateInfo() {
		int result = 0;
		try {
			//1.DB 연결
			conn();
			//2. query 작성
			String sql = "update member set pw =? where id =?"; // where절 유의해서 쓰기 (엉뚱한 데이터 수정될 수도 있음)
			// 3. 창구 및 query 생성
			pstmt = conn.prepareStatement(sql);
			// 4. 데이터 입력
			pstmt.setString(1, "4321");
			pstmt.setString(2, "A");
			//5. 실행
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		if(result == 1) {
			System.out.println(result + "건이 수정되었습니다.");
		} else {
			System.out.println("수정되지 않았습니다.");
		}
		
		
	}
	//한건 입력 
	private void insertInfo() {
		int result = 0;
		
		try {
			//1. db연결
			conn();
			// 2. query 작성
			String sql = "insert into member values(?,?,?)";
			//3. 창구 생성
			pstmt = conn.prepareStatement(sql);
			//4. query 데이터 입력
			pstmt.setString(1, "F"); 	 //values의 첫번째 ? 데이터값
			pstmt.setString(2, "1234");  //values의 두번째 ? 데이터값
			pstmt.setString(3, "김씨");  //values의 세번째 ? 데이터값
			
			//DML (insert, update, delete) -> executeUpdate()
			//Select -> executeQuery() 
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			
		} finally {
			disconnect();
		}
		
		if(result == 1) { // 성공시 1행이 삽입되므로 result == 1, 실패시 0행 삽입이므로 false -> else로 감
			System.out.println("정상 입력되었습니다."); // 자바에서는 sql 입력시 자동 commit 됨
		} else {
			System.out.println("입력에 실패하였습니다.");  
		}
		
	}
	//한건 조회
	private void getMember() {
		Member member = null;
		try {
			//1. db 연결
			conn();
			
			//2. query문 작성
			String sql = "select * from member where id = ?"; 
			pstmt = conn.prepareStatement(sql); // 받는 것과 동시에 보내줌
			pstmt.setString(1, "A"); // 첫번째 ?에는 A를 넣어라
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPw(rs.getString("pw"));
					
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		System.out.println("**********************");
		System.out.println(member.toString());
		
	}
	// 전체 조회
	// 멤버 여러건 
	private void showInfo() {
		List<Member> list = new ArrayList<>(); // 멤버 데이터 여러개를 받기 위해 List 사용
		Member mem = null;						// List 사용하기 위해 member 객체 만들기
		
		try {
			// 1. conn() 메소드로 DB 연결 
			conn(); 
			
			// 2. query 작성
			String sql = "select * from member";
			
			// 3. 연결된 DB(java <-> Database)에 query문 보낼 수 있는 창구 생성 
			stmt = conn.createStatement();
			
			// 4. 3번에서 만든 창구로 query문을 보냄
			// ResultSet(rs) select 조회할 때만 사용 
			rs = stmt.executeQuery(sql); 
			
			// 데이터 하나씩 꺼내오기 위해 while문 씀.
			//rs.next()가 데이터가 있는지 돌아가면서 확인하고, 존재할 경우 True가 되어 while 문이 돌아감
			while(rs.next()) {
				mem = new Member();
				mem.setId(rs.getString("id"));
				mem.setName(rs.getString("name"));
				mem.setPw(rs.getString("pw"));
				list.add(mem);				
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {							// finally 전원이 불안정할 때를 대비해서 넣어줌
			disconnect(); 
		}
		
		for(Member member : list) {
			System.out.println(member.toString()); // toString => 데이터 뿌려주기 위해서.
			
		}
		
	}
	
}


