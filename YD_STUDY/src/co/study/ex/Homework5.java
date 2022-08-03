package co.study.ex;
/*추가문제) 아래와 같이 변수 값이 주어질 경우 각 자리의 합을 구해 출력하시오
 * 예시) 373일 경우, 3 + 7 + 3 = 13으로 결과는 13입니다.
 * 힌트) 곱하기 연산자(*) 나누기 연산자 (/) 뺴기 연산자(-)를 이용하세요
 */

public class Homework5 {

	public static void main(String[] args) {
		int value = 485;
		
		int num1 = value / 100;
		int num2 = num1 * 2;
		int num3 = num2 - 3;
		
		System.out.println("각 자리 수의 합은 "+num1+num2+num3);
		
/* 강사님 풀이
 * int val = 373; 
 * 
 * int val2 = 373/100;                    // 3 
 * 
 * int val3 = (373-(va2*100))/10            // 7
 *             
 * 
 * int val4 = (373-(val2*100)-(val3*10);  //3 
 *              373 - 300 - 70 = 3  
 * 
 * 
 * 		
 */
		
		
		
		
		
		
		
		
		
		
		
		
		
	
//		int sum = 0;
//		while (value > 0) {
//			sum += value % 10;
//			value /= 10;
//		}
//		System.out.println(sum);   //while 문으로도 각 자리 수 합 구할 수 있음
	}

}

//485/ 10 = 48   나머지 5
//48 / 10 = 4    나머지 8
// 4 / 10 =      나머지 4