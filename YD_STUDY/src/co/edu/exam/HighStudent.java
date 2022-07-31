package co.edu.exam;
//toString()

public class HighStudent extends Student {
	// 고등학생정보 : 담임교사, 학년 정보 추가.
	private String teacher ;
	private int grade;
	
	// 생성자.
	public HighStudent() {}

	public HighStudent(int StudentNo, String name, int score,  String teacher, int grade) {
		super(StudentNo, name, score);
		this.teacher = teacher;
		this.grade = grade;
	}
	
	

	@Override
	public String toString() {
		return "고등학생 정보 ["+"학생 번호 : " + getStudentNo() + ", 이름 : " + getName() + ", 성적 : " + getScore() +
				", 담임 교사 : " + teacher + ", 학년 : " + grade +  "]";
	}
	
	
	
}


