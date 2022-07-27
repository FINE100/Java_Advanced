package co.study.ex;

import co.study.solve.Employee;

public class EmpDept extends Employee {
	public String depname;
	
	public EmpDept() {}

	public String getDepname() {
		return depname;
		
	}
	public void getInformation() {
		
	}
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
	

	@Override
	public String toString() {
		return "EmpDept [부서이름=" + depname + ",[ 이름" + super.toString() + "]";
	}
	
	

}
