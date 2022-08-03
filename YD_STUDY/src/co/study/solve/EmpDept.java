package co.study.solve;
/*EmpDept 정의
 * 1) Employee 클래스 상속
 * 2) 추가로 부서이름 필드, 생성자 이용하여 값 초기화 
 * 3) 추가된 필드의 getter 정의
 * 
 * Employee 클래스의 메소드 오버라이딩
 * public void getInformation() : 이름, 연봉, 부서
 * public void print() : "수퍼클래스 \n 서브클래스" 문구 출력
 */

public class EmpDept extends Employee {
	
	//필드
	private String depName;
	
	//생성자
	public EmpDept(String name, int salary, String depName) {
		super(name, salary); // 상속은 부모를 거쳐서 자식을 만드는 것이므로 , 자식 객체 생성자 만들때 부모 객체의 생성자도 넣어서 만들어줘야함.
		this.depName = depName;
	}
	
	
	//메소드
	public String getDepName() {
		return depName;
	}
	
	@Override // 오버라이딩 했다는 뜻으로 표기해줌. 자체 기능은 아님.
	public void getInformation() {
		System.out.println("이름 : " + name + ", 연봉 : " + salary + ", 부서 : "+ depName); 
		// 부모 클래스 필드가 protected 접근제어자로 되어 있어서 필드명 직접 쓸 수 있음
	}

	@Override
	public void print() {
		super.print();
		System.out.println("서브클래스");
	}



	
	
}
