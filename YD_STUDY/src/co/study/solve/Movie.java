package co.study.solve;
/* Movie 정의
 *  - 필드 : 장르
 *  - 생성자 초기화
 *  - 메소드 
 *  public void getInformation() 
 *  제목, 감독 수, 배우 수, 관객 수, 총점, 평점 출력 
 * 
 */

public class Movie extends Culture { 
	

	//필드
	String gerne;
	
	//생성자
	public Movie(String tilte, int director, int actor) {
		super(tilte, director, actor);
		
	}

	@Override
	public void getInformation() {  //부모 클래스 Culture를 추상 클래스로 만들었으므로 반드시 오버라이딩 해야함 (cf) 인터페이스 
		System.out.println("영화제목 : " +  title);
		System.out.println("감독 수 : "  +  director);
		System.out.println("배우 수 : " +  actor);
		System.out.println("영화 총점 : " +  totalScore);
		System.out.println("영화 평점 : " +  getGrade());
		
		
	}
	
	
	
	
	
	
}
 
//	String genreM = "영화"; // 장르 필드 : 영화 
//	
//	public Movie() {
//		
//	} // 생성자 초기화 
//	
//	public Movie(String cTitle, int directorNo, int actorNo) {
//		super(cTitle, directorNo, actorNo);
//	}
//	
//	
//	
//	public String getGenreM() {
//		
//		return genreM;
//	}
//
//	public void setGenreM(String genreM) {
//		this.genreM = genreM;
//	}
//	
//	
//
//	@Override
//	public String getGrade() {
//		return super.getGrade();
//	}
//
//	public void getInformation() {
//		//제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
//		System.out.println(genreM + " 제목: " + cTitle);
//		System.out.println("감독: "+ directorNo);
//		System.out.println("배우: "+ actorNo);
//		System.out.println(genreM + "총점: " + score);
//	//	System.out.println(genreM + "평점: " + getGrade());
//	}
//}
//	
//
//
