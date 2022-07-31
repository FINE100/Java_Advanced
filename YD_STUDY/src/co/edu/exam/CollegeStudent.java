package co.edu.exam;
//toString()

public class CollegeStudent extends Student {
	// 대학생정보 : 담당교수, 전공과목 정보 추가.
		String prof;
		String major;
		
		
	// 생성자.
		public CollegeStudent() {}

		public CollegeStudent(int StudentNo, String name, int score,  String prof, String major) {
			super(StudentNo, name, score);
			this.prof = prof;
			this.major = major;
	
		}	
	// toString()
			
		@Override
		public String toString() {
			return " 대학생 [" + "학번 : " + getStudentNo()	+ ", 이름 : " + getName() + ", 성적 : " + getScore() + 
					 ", 담당 교수 : " + prof + ", 전공 " + major + "]";
		}
}