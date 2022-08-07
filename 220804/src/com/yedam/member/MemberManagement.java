package com.yedam.member;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class MemberManagement extends DAO {
	// 싱글톤으로 만들기 : 싱글톤으로 만들어두면 객체를 추가 생성하지 않고 양호하게 사용 가능함.

	private static MemberManagement mm = null;

	// private 생성자 생성
	private MemberManagement() {

	}

	public static MemberManagement getInstance() {
		if (mm == null) {
			mm = new MemberManagement();
			return mm;
		} else {
			return mm;

		}
	}

	// 1. 전체 조회
	public List<Member> getMemberList() {
		List<Member> list = new ArrayList<>();
		Member member = null; // list 받기 위한 객체

		try {
			// 1.DB 연결
			conn();
			// 2. query 작성
			String sql = "SELECT * FROM member";
			// 3. DB 연결 후 조회할 수 있는 창구 생성
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				// 여기서 초기화하는 이유 :
				// 멤버에 대한 정보를 얻어서 list에 넣어주기 위해
				member = new Member();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPw(rs.getString("pw"));
				list.add(member);

			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			disconnect();
		}
		return list;
	}

	// 2. 단건 조회 Primary key (not null, unique)
	public Member getMember(String id) {
		Member member = null;
		try {
			conn();
			String sql = "SELECT * FROM member where id = ?";
			pstmt = conn.prepareStatement(sql);
			// 매개변수를 통한 데이터 조회 (매개변수 타입 String)
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPw(rs.getString("pw"));
				
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			disconnect();
		}
		return member;
	}

	// 3. 입력
	public int insertMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "insert into member values (?,?,?)";
			// String sql = "insert into member (id,pw) values (?,?)"; insert문 두개 다 가능.
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getPw());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 4. 수정 (기존 회원 ID 조회하여 수정할 패스워드 입력) 
	public int updateMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "update member set pw = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getPw());
			pstmt.setString(2, member.getId());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 5. 삭제
	public int deleteMember(String id) {
		int result = 0;
		try {
			conn();
			String sql = "delete from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
}
