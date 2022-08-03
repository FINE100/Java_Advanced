package co.study.solve;
// Homework18에 필요한 클래스 
public class Product {
	// 필드 
	private int price;
	private int amount;
	private String name;
	
	// 생성자 : 만들지 않으면 자바에서 자동으로 생성하여 컴파일해줌
	
	// 메소드 
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
   // get, set 쓰는 이유 : 데이터 유효성 때문 (말도 안되는 값 방지 위해) 
   // 예) price = 10은 불가능 setPrice에서 미리 조건문으로 막을 수 있음
   // public void setPrice(int price) {
   //  if(price <0){ price = 0; }
   // }

}
