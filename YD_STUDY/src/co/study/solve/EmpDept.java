package co.study.solve;

import co.study.solve.Employee;

public class EmpDept extends Employee {
	private String depName;

	public EmpDept(String name, int salary, String depName) {
		super(name, salary);
		this.depName = depName;
	}

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println("부서 : "+ depName);
	}

	@Override
	public void print() {
		super.print();
		System.out.println("서브클래스");
	}

}
