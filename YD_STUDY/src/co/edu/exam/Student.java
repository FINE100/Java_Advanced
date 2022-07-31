package co.edu.exam;

public class Student {
	// 학생번호, 학생이름, 점수
	private int StudentNo;
	private String name;
	private int score;
	
	//생성자
	 public Student() {}
	 
	 public Student(int StudentNo, String name, int score) {
		 this.StudentNo = StudentNo;
		 this.name = name;
		 this.score = score;
		 
		 	 
	 }
	 
	//메소드	

	public int getStudentNo() {
		return StudentNo;
	}

	public void setStudentNo(int studentNo) {
		StudentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [학생번호 : " + StudentNo + ", 이름 : " + name + ", 점수 : " + score + "]";
	}
	 
	 

	}