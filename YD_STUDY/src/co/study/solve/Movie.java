package co.study.solve;

public class Movie extends Culture { 
 
	String genreM = "영화"; // 장르 필드 : 영화 
	
	public Movie() {
		
	} // 생성자 초기화 
	
	public Movie(String cTitle, int directorNo, int actorNo) {
		super(cTitle, directorNo, actorNo);
	}
	
	
	
	public String getGenreM() {
		
		return genreM;
	}

	public void setGenreM(String genreM) {
		this.genreM = genreM;
	}
	
	

	@Override
	public String getGrade() {
		return super.getGrade();
	}

	public void getInformation() {
		//제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
		System.out.println(genreM + " 제목: " + cTitle);
		System.out.println("감독: "+ directorNo);
		System.out.println("배우: "+ actorNo);
		System.out.println(genreM + "총점: " + score);
	//	System.out.println(genreM + "평점: " + getGrade());
	}
}
	


