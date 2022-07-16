package co.study.ex;

public class Homework3 {
	
	public static void main(String[] args) {
		
	byte a = 35;
	byte b = 25;
	int c = 463;
	long d = 1000L;
	double e = 45.31;	

	double result1 = a + c + d;
	System.out.println(result1); // byte + int + long 이므로 표현 범위가 가장 큰 double 로 형변환
	
	int result2 = a + b + c;
	System.out.println(result2); // byte + byte + int 이므로 int로 형변환
	
	double result3 = c + d + e;
	System.out.println(result3); // int + long + double 이므로 표현 범위가 가장 큰 double로 형변환	
	

	}
}
