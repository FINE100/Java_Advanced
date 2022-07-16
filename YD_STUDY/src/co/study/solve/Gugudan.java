package co.study.solve;
/*
 * 문제. 구구단 출력하기 
 * 출력형태 
 * === 2단 ====
 * 2 * 1 = 2
 * 2 * 2 = 4... 
 */

public class Gugudan {

	public static void main(String[] args) {
		for(int i = 2; i<=9 ; i++) {
			System.out.println("******"+i+ "단 *******");
		for(int j =1; j<=9 ; j++) {
			System.out.println(i+"*"+j+"="+(i*j));
		} 
		
	}

}
}