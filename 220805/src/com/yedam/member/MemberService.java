package com.yedam.member;

// botom - top 설계 방식 (작은 기능부터 큰 뼈대까지 역순으로 제작)
// 비지니스 로직 짜는 곳. 이 로직을 실행 클래스에서 돌리면 돌아감.
public class MemberService {

	public MemberDTO doLogin(MemberDTO member) {
		// DTO에 정의한 쿼리로 로그인 될 수 있도록 정의
		// 관리를 용이하게 하기 위해 1. 데이터 불러오는 부분 2. 기능 정의하는 부분 나눔
		MemberDTO mem = MemberManage.getInstance().login(member);
		if (mem == null) {
			System.out.println("로그인 실패");
			return null;
		} else {
			System.out.println("로그인 성공");
			return mem;
		}

	}

}
