package co.study.solve;

public abstract class Culture { // 추상 클래스 abstract 추가

	String cTitle; // 제목
	int directorNo; // 참여 감독 수
	int actorNo; // 참여 배우 수
	int audienceNo = 0; // 참여 관객 수
	int score = 0; // 점수
	
	public Culture() {
		
	} // 생성자 초기화 : 제목, 감독 수, 배우 수
	
	public Culture(String cTitle, int directorNo, int actorNo) {
		this.cTitle = cTitle;
		this.directorNo = directorNo;
		this.actorNo = actorNo; 
		
		
	}
	
	public void setTotalScore(int score) {
		this.score += score; // 점수 누적
		this.audienceNo++; // 관객 누적 
	}
	
	public String getGrade() {
		String grade = null;
		int starScore = (int)score/audienceNo;
	
		if(starScore == 1) {
			grade = "☆";
		}else if(starScore == 2) {
			grade = "☆☆";
		}else if(starScore == 3) {
			grade = "☆☆☆";
		}else if(starScore == 4) {
			grade = "☆☆☆☆";
		}else { 
			grade = "☆☆☆☆☆";
		}
		return grade;
	}
	
	public abstract void getInformation(); //추상 메서드 이용 : 자식 클래스로 기능 추가
		
		}
		
	

