package com.yedam.member;
/*  테이블에 맞게 필드, 게터 세터 작성 */

public class MemberDTO {
	/*MEMBER_ID     NOT NULL VARCHAR2(20)  
	  MEMBER_PW     NOT NULL VARCHAR2(20)  
     MEMBER_NAME   NOT NULL VARCHAR2(10)  
     MEMBER_BELONG          VARCHAR2(100) 
	 */

	private String memberId; 	 // MEMBER_ID .. 회원아이디
	private String memberPw; 	 // MEMBER_PW .. 회원패스워드   
	private String memberName;   // MEMBER_NAME .. 회원이름
	private String memberBelong; // MEMBER_BELONG .. 회원소속
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberBelong() {
		return memberBelong;
	}
	public void setMemberBelong(String memberBelong) {
		this.memberBelong = memberBelong;
	}
	
	
	
	
	
	}
