package com.yedam.review;

public class InterfaceTest implements InterfaceSample {
	// 재정의해서 사용 (무조건 불러와줘야함)
	// 공통의 기능 개발하여 활용할 때 유용

	@Override
	public void test() {
		double a = InterfaceSample.PI;
	}

	@Override
	public int service() {
		return 0;
	}

}
