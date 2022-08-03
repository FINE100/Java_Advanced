package co.study.solve;
/* Culture 정의
 * - 필드:  제목, 참여 감독수, 관객수, 총점 
 *  - 생성자 이용하여 값 초기화(제목, 감독 수, 배우 수)
 *  - 메소드 정의
 *  1) public void setTotalScore(int score) : 관객수와 총점 누적 
 *  2) public String getGrade(): 평점 구하는 기능
 *  3) public abstract void getInformation() : 정보 출력 추상 메소드
 * 
 */

public abstract class Culture { // 추상 클래스 abstract 추가
	
	//필드 
	protected String title; 	// 제목
	protected int director; 	// 참여 감독 수
	protected int actor; 		// 참여 배우 수
	protected int audience; 	// 참여 관객 수
	protected int totalScore; 	// 점수
	
	// 생성자
	
	public Culture(String tilte, int director,int actor) {
		this.title = title;
		this.director = director;
		this.actor = actor; 
	}
	
	// 메소드 
	public void setTotalScore(int score) {
		// 평점 인원 한 명 추가
		audience ++ ; 
		// 총점 = 평점 누적  
		totalScore += score; 		
	}

	public String getGrade() {
		int avg = totalScore/audience;
		String grade = null; 
		switch(avg) {
		case 1 : 
			grade = "★☆☆☆☆";
			break;
			
		case 2 :
			grade = "★★☆☆☆";
			break;
			
		case 3 :
			grade = "★★★☆☆";
			break;
			
		case 4 :
			grade = "★★★★☆";
			break;
			
		case 5 :
			grade = "★★★★★";
			break;
		}		
		
		return grade;
	}
	
	public abstract void getInformation(); //자식 클래스에서 필수로 상속받아 이용하므로 비워두면 됨
	
}
	
	
	


//	String cTitle; // 제목
//	int directorNo; // 참여 감독 수
//	int actorNo; // 참여 배우 수
//	int audienceNo = 0; // 참여 관객 수
//	int score = 0; // 점수
//	
//	public Culture() {
//		
//	} // 생성자 초기화 : 제목, 감독 수, 배우 수
//	
//	public Culture(String cTitle, int directorNo, int actorNo) {
//		this.cTitle = cTitle;
//		this.directorNo = directorNo;
//		this.actorNo = actorNo; 
//		
//		
//	}
//	
//	public void setTotalScore(int score) {
//		this.score += score; // 점수 누적
//		this.audienceNo++; // 관객 누적 
//	}
//	
//	public String getGrade() {
//		String grade = null;
//		int starScore = (int)score/audienceNo;
//	
//		if(starScore == 1) {
//			grade = "☆";
//		}else if(starScore == 2) {
//			grade = "☆☆";
//		}else if(starScore == 3) {
//			grade = "☆☆☆";
//		}else if(starScore == 4) {
//			grade = "☆☆☆☆";
//		}else { 
//			grade = "☆☆☆☆☆";
//		}
//		return grade;
//	}
//	
//	public abstract void getInformation(); //추상 메서드 이용 : 자식 클래스로 기능 추가
//		
//		}
//		
//	
//
