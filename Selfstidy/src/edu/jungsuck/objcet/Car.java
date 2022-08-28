package edu.jungsuck.objcet;
//생성자 : 클래스와 이름이 동일해야한다, 리턴 값이 없다 (void 안붙임), 1개 이상 존재해야함

public class Car {
	String color;      // 색상
	String gearType;   // 기어 - auto(자동), manual(수동)
	int door; 		   // 문의 개수 
	
	Car(){
	this("white", "auto", 4);	//생성자 this 
	}

	Car(String color){
		this(color, "auto", 4);	
		}
	
	Car(String color, String gearType, int door){
		this.color = color;	// 참조변수 this >> this.iv = lv 라는 뜻임 
		this.gearType = gearType;
		this.door = door;
		}
	
	
	
	
	
	
	
	
	
	

}