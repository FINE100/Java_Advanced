package co.study.solve;
/* Employee, EmpDept 실행 클래스
 */

public class EmpMain {
	public static void main(String[] args) {
		
		Employee emp = new EmpDept("이지나", 3000, "교육부");
		//다형성 : 인터페이스는 자식클래스를 통해서 활동할 수 있다.  
		//부모 타입 클래스를 자식 타입 클래스 호출해서 초기화 -> 자식의 메소드를 사용 가능 (여러 방면으로 응용가능한 것)
		// 자원타입 변환과 관련 
		
		emp.getInformation(); // 자식클래스의 메소드로 나옴 
		emp.print();		  // 자식클래스의 메소드로 나옴 
		
		
	}
}
