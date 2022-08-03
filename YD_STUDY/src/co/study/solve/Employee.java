package co.study.solve;

/* 1. 필드 : 이름, 연봉
 * 2. 생성자를 이용해 값을 초기화 
 * 3. 조건 : getter만 존재
 * 4. 메소드 정의
 * - public void getInformation() : 이름, 연봉 출력 기능
 * - public void print() : "수퍼클래스" 출력 기능 
 */

// ctrl + n = 클래스, 인터페스 등.. 만들기 단축키 

public class Employee {

	// 필드 : 이름, 연봉
	protected String name;   // 자식이 접근하기 위해서는 default 접근 제어자, 또는 protected 접근 제어자 사용 
	protected int salary;
	
	// private : 클래스 내에서만 사용 ( 상속받아서 사용할 때는 get필드로 불러와야함)
	// protected : 상속 받아서 사용 
	// default	


	// 생성자
	public Employee() {
	}

	
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
		
	
//	오버 로딩 : 같은 이름이지만 매개변수 내용에 따라 여러개 동일하게 만들 수 있다.
//	public Employee(int salary, String name) {  //매개 변수 위치만 달라도 생성 가능
//		this.salary = salary;
//		this.name = name;
//		
//
//	}
//
//	public Employee(String name) { // 한개짜리도 만들 수 있음
//		this.name = name;
//
//	}
//
//	public Employee(int salary) {// 한개짜리도 만들 수 있음
//		this.salary = salary;
//
//	}

	// 메소드
	public String getName() {
		return name;
	}



	public int getSalary() {
		return salary;
	}

	public void getInformation() {
		System.out.println("이름 : " + name + ", 연봉 : " + salary);
//		
	}

	public void print() {
		System.out.println("수퍼클래스");
	}

}



// 오버라이딩 : 부모가 물려준 메소드를 자식이 알아서.. 좋을대로.. 활용 하는 거 
