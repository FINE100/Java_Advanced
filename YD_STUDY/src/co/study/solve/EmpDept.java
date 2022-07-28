package co.study.solve;

import co.study.solve.Employee;

public class EmpDept extends Employee {
	public String depName;
	
	
	public EmpDept() {}
	
	
	public void getInformation(String name, int salary,String depName) {
		System.out.printf("이름 : %5S, 연봉 : %d, 부서이름 : %5S", name, salary, depName);
		
		
		
	}
	public void print() {
		System.out.print("\n수퍼클래스\n서브클래스");
	}	

	}
	
	

