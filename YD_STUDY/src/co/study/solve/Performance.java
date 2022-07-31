package co.study.solve;

public class Performance extends Culture {
	
String genreP = "연극"; // 장르 필드 : 연극
	
	public Performance() {
		
	} // 생성자 초기화 
	
	public Performance(String cTitle, int directorNo, int actorNo) {
		super(cTitle, directorNo, actorNo);
	}
	
	
	public String getGenreP() {
		return genreP;
	}

	public void setGenreP(String genreP) {
		this.genreP = genreP;
	}

	public void getInformation() {
		//제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
		System.out.println(genreP + " 제목: " + cTitle);
		System.out.println("감독: "+ directorNo);
		System.out.println("배우: "+ actorNo);
		System.out.println(genreP + "총점: " + score);
		System.out.println(genreP + "평점: " + getGrade());
	}
}
	


