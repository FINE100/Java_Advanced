package co.study.ex;

import co.study.solve.Employee;

public class EmpDept extends Employee {
	public String depName;
	
	
	public EmpDept() {}
	
	public EmpDept(String name, int salary,String depName) {
		super(name,salary);
		this.depName = depName;
		
	}

	
	public void getInformation(String name, int salary,String depName) {
		System.out.printf("이름 : %5S, 연봉 : %d, 부서이름 : %5S", name, salary, depName);
		
		
		
	}
	public void print() {
		System.out.print("\n수퍼클래스\n서브클래스");
	}
	
	public String getDepname() {
		return depName;
		
	}

	@Override
	public String toString() {
		return " 부서 정보 [사원 이름 =" + name + ", 연봉=" + salary + ", 부서이름" + depName+"]";
	}
	
	

	}
	
	

