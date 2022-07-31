package co.edu.exam;
import java.util.ArrayList;
import java.util.List;
// 등록, 수정, 리스트, 종료
import java.util.Scanner;


public class StudentApp {
	
	List<Student> studentAry = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);

	   public void execute() {
		   
		  while(true) {
			  System.out.println("학생정보 관리 시스템입니다.");
			  System.out.println("1. 등록 | 2. 수정 | 3. 리스트 | 9. 종료");
			  System.out.println("원하시는 메뉴 선택하세요 >>> ");
			  
			  int selectNo = Integer.parseInt(scn.nextLine());
			  
			  if(selectNo == 1) {
				  
				  System.out.println("1. 고등학교 정보 | 2. 대학생 정보");
				  System.out.println("선택 >> ");
				  int choice = Integer.parseInt(scn.nextLine());
				  System.out.println("학생 번호> ");
					int studentNo = Integer.parseInt(scn.nextLine());
					System.out.println("학생 이름> ");
					String name = scn.nextLine();
					System.out.println("성적> ");
					int score = Integer.parseInt(scn.nextLine());

				  
				  if(choice == 1) {
					  System.out.println("담임 교사 >");
					  String teacher = scn.nextLine();
						System.out.println("학년 > ");
						int grade = Integer.parseInt(scn.nextLine());
						
						addStudent(new HighStudent(studentNo,name,score,teacher,grade));
						
				  } else if(choice == 2) {
					  System.out.println("담당 교수 >");
					  String prof = scn.nextLine();
						System.out.println("전공 > ");
						String major = scn.nextLine();
						
						addStudent(new CollegeStudent(studentNo,name,score,prof,major));  
					  
				  }
			  }
			  
			  if(selectNo == 2) {
				  System.out.println("정보 수정이 필요한 학생 번호를 입력하세요");
				  int studentNo = Integer.parseInt(scn.nextLine());
				  
				  System.out.println("수정할 성적 정보를 입력하세요.");
				  int score = Integer.parseInt(scn.nextLine());
				  
//				  modifyStudent(studentNo, null, score);
				  
				  System.out.println("수정 되었습니다.");
			  }
			  
			  
		  }
		   
		   
		  
		   
	      }




//등록
public void addStudent(Student student) {
	studentAry.add(student);
}

// 수정
public void modifyStudent(Student student) {
	for (int i = 0; i < studentAry.size(); i++) {
		if (student.getStudentNo() == studentAry.get(i).getStudentNo()) {
			studentAry.get(i).setScore(student.getScore());
		}
	}

}

public List<Student> studentList() {
	return studentAry;
}
}
 
	      
	   
