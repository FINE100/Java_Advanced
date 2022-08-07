package com.yedam.app;

import java.util.Scanner;

import com.yedam.member.MemberDTO;
import com.yedam.member.MemberService;
import com.yedam.student.StudentDTO;
import com.yedam.student.StudentService;

public class LMSApp {// 학습 관리시스템
	MemberService ms = new MemberService();
	StudentService ss = new StudentService();
	Scanner scn = new Scanner(System.in);
	int menu = 0;

	// 전역에서 공유 가능( static과 비슷.. 하지만 같은 개념 아님)
	MemberDTO MD = null;

	public LMSApp() {
		run();

	}

	private void run() {

		while (true) {
			menuNo();
			// 로그인 되지 않았을 때
			if (MD == null) {
				// 로그인 실행 
				if (menu == 1) {
					MemberDTO member = new MemberDTO();

					System.out.println("아이디 입력>");
					String id = scn.nextLine();

					System.out.println("비밀번호 입력>");
					String pw = scn.nextLine();

					member.setMemberId(id);
					member.setMemberPw(pw);

					// MD 객체를 불러와 MemberSerive doLogin 기능 사용 하게 함
					MD = ms.doLogin(member);

				} else if (menu == 2) {
					System.out.println("프로그램 종료");
					break;
				}
			} else {
				// 학생 등록
				if(menu == 1) {
					StudentDTO std = new StudentDTO();
					
					System.out.println("ID 입력 >"); 		// ID
					int id = Integer.parseInt(scn.nextLine());
					System.out.println("이름 입력 >");		// name
					String name = scn.nextLine();
					System.out.println("강의실 입력 >");		// class
					String lecture = scn.nextLine();
					System.out.println("주소 입력 >");		// addr
					String addr = scn.nextLine();
					System.out.println("전화번호 입력 >");		// tel
					String tel = scn.nextLine();
					
					std.setStudentId(id);
					std.setStudentName(name);
					std.setStudentClass(lecture);
					std.setStudentAddr(addr);
					std.setStudentTel(tel);
					
					ss.insertStudent(std);
					
				}
				// 학생 성적 입력 
				else if(menu == 2) {
					StudentDTO std = new StudentDTO();					
					System.out.println("ID 입력 >");
					int id = Integer.parseInt(scn.nextLine());
					
					std.setStudentId(id);
					
					// 존재하면
					std = ss.getStudent(std); //
					if(std != null) {
						ss.insertSubject(std);
					} else {
						System.out.println("정보가 없습니다.");
					}
										
				} 
				// 학생 정보 수정 
				else if(menu == 3) {
					// 전화번호 변경
					ss.updateTel();
					
				} 
				// 학생 정보 조회 
				else if(menu == 4) {
					StudentDTO std = new StudentDTO();
					System.out.println("ID 입력>");
					int id = Integer.parseInt(scn.nextLine());
					std.setStudentId(id);
					std = ss.getStudent(std);
					
					System.out.println(std);
					
				}
			}
		}

	}

	private void menuNo() {
		if(MD == null) {
		System.out.println("1.로그인 | 2. 종료");
		System.out.println("입력>");
		menu = Integer.parseInt(scn.nextLine());

	} else {
		System.out.println("1. 학생 등록 | 2. 성적입력 | 3. 학생 정보 수정 | 4. 학생 정보 조회");
		menu = Integer.parseInt(scn.nextLine());
		
	}

}
}
