package com.yedam.student;

import java.util.Scanner;

public class StudentService {
	/*
	 * 2. 학생 등록 insert => 학생 정보에 대한 입력 => insert 데이터 입력
	 * 
	 * 3. 학생 성적 입력 update => 학생 ID 입력 후 존재하면 성적 입력
	 * 
	 * 4. 학생 정보 수정 update => 4-1. 이름 변경 4-2. 주소 변경 4-3. 전화번호 변경
	 * 
	 * 5. 학생 정보 조회 select => ID로 조회
	 * 
	 */
	Scanner scn = new Scanner(System.in);

	// 1. 학생 등록
	public void insertStudent(StudentDTO std) {
		int result = StudentManage.getInstance().insertStudnet(std);
		// rsult == 1의 의미 : 1행 삽입 성공 
		  if(result == 1) {
			System.out.println("학생 정보 입력 성공");
		} else {
			System.out.println("학생 정보 입력 실패");
		}
	}

	public void insertSubject(StudentDTO std) {
		// 1. 성적 입력 -> 1. 국어 2. 영어 3. 수학

		int menu = 0;
		System.out.println("======= 성적 입력 ========");
		System.out.println("1. 국어 | 2. 영어 | 3. 수학 ");
		menu = Integer.parseInt(scn.nextLine());

		System.out.println("입력 > ");

		// 국어점수 입력
		if (menu == 1) {
			int kor = Integer.parseInt(scn.nextLine());
			std.setStudentKor(kor);
			checkResult(StudentManage.getInstance().insertKor(std)); // 싱글톤, 밑과 방법 동일함 

			// 영어점수 입력
		} else if (menu == 2) {
			int eng = Integer.parseInt(scn.nextLine());
			std.setStudentEng(eng);
			
			int result = StudentManage.getInstance().insertEng(std); // 싱글톤
			checkResult(result);

			// 수학점수 입력
		} else if (menu == 3) {
			int math = Integer.parseInt(scn.nextLine());
			std.setStudentMath(math);
			int result = StudentManage.getInstance().insertMath(std);
			checkResult(result);
		}

	}
	
	// 학생 정보 수정 (전화번호 수정)
	public void updateTel() {
		
		StudentDTO std = new StudentDTO();
		
		System.out.println("ID 입력 > ");
		int id = Integer.parseInt(scn.nextLine());
		System.out.println("변경할 전화번호 입력 > ");
		String tel = scn.nextLine();
		
		std.setStudentId(id);
		std.setStudentTel(tel);
		
		int result = StudentManage.getInstance().updateTel(std);
		checkResult(result);
		
		
	}
	
	//학생 정보 조회
	public StudentDTO getStudent(StudentDTO std) {
		
	    return StudentManage.getInstance().getstudent(std.getStudentId()); // 조회하는 값 반환
	}
	
	public void checkResult(int value) {
		if(value == 1) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}

}
