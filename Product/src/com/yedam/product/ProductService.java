package com.yedam.product;

import java.util.List;
import java.util.Scanner;

public class ProductService {
	
	Scanner scn = new Scanner(System.in);

	// 상품 조회(이름과 가격)
	public void getproduct() {
		List<Product> list = ProductDAO.getInstance().getProduct();
		for(Product product : list) {
			System.out.println("=============================");
			System.out.println("| 상품명 ) " + product.getProductName()+"|");
			System.out.println("| 상품가격) " + product.getProductPrice()+"|");			
			System.out.println("=============================");
		}
		
	}
	
	// 상품 상세 조회 (전체)
	public void getDetailProduct() {
		List<Product> list = ProductDAO.getInstance().getDetailProduct();
		for(Product product : list) {
			System.out.println("*****************************");
			System.out.println("* 상품명 > " + product.getProductName()+"*");
			System.out.println("* 상품ID > " + product.getProductId()+"*");
			System.out.println("* 상품가격 > " + product.getProductPrice()+"*");
			System.out.println("* 상품설명 > " + product.getProductExplain()+"*");
			System.out.println("*  판매량 > " + product.getProductSales()+"*");
			System.out.println("* 진열점포 > " + product.getStores()+"*");
			System.out.println("*****************************");
		}
	}
	
	// 2-3) 점포별 상품 조회
	
	public void getStoreProduct() {
		System.out.println("점포 입력 >> ");
		String stores = scn.nextLine();
		List<Product> list = ProductDAO.getInstance().getStoreProduct(stores);
		
		
		// 어떤 지점인지 내용 쓰기 위해 사용. 첫번째 객체에 있는 점포 내용 가져와달라는 내용.
		System.out.println(list.get(0).getStores() + "지점입니다.");
		
		for(int i =0; i<list.size(); i++) {
			System.out.println("------------------------------");
			System.out.println("상품명 > " + list.get(i).getProductName());
			System.out.println("상품ID > " + list.get(i).getProductId());
			System.out.println("상품가격 > " + list.get(i).getProductPrice());
			System.out.println("상품설명 > " + list.get(i).getProductExplain());
			System.out.println(" 판매량 > " + list.get(i).getProductSales());
			System.out.println("진열점포 > " + list.get(i).getStores());
			System.out.println("------------------------------");
			
		}
	}
	
	// 2-4) 상품등록
	
	public void insertProduct() {
		Product product = new Product();
		
		System.out.println("상품명 > ");
		String productName = scn.nextLine();
		
		System.out.println("상품 ID > ");
		String productId = scn.nextLine();
		
		System.out.println("상품 가격 > ");
		int productPrice = Integer.parseInt(scn.nextLine());
		
		System.out.println("상품 설명 > " );
		String productExplain = scn.nextLine();
		
		System.out.println("판매량 > ");
		int productSales = Integer.parseInt(scn.nextLine());
		
		System.out.println("진열점포 > ");
		String productSotres = scn.nextLine();		
		
		product.setProductName(productName);
		product.setProductId(productId);
		product.setProductPrice(productPrice);
		product.setProductExplain(productExplain);
		product.setProductSales(productSales);
		product.setStores(productSotres);
		
		int result = ProductDAO.getInstance().insertProduct(product);
				
		if(result == 1)
		{		System.out.println("등록 완료");
		} else {
			System.out.println("등록 실패");
		
	}
		
	}
	
	// 2-5)상품 삭제
	
	public void deleteProduct() {
		System.out.println("삭제 상품 ID > ");
		String productId = scn.nextLine();
		
		int result = ProductDAO.getInstance().deleteProduct(productId);
		
		if(result == 1)
		{		System.out.println("삭제 완료");
		} else {
			System.out.println("삭제 실패");
		
	}
		
	}
	
	
		
	//  2-6) 상품 판매 갯수 출력 + 판매 금액 
	// 모든 데이터 loading
	// 가져온 데이터를 자바에서 가공해서 출력
	
	public void calProduct() {
		List<Product> list = ProductDAO.getInstance().getDetailProduct();
		int sum = 0;
		
		for(Product product : list) {
			System.out.println("###########################");
			System.out.println("# 상품명 > " + product.getProductName()+ "#");
			System.out.println("# 상품판매갯수 > " + product.getProductSales() + "#");
			System.out.println("# 상품 판매 금액 > " + product.getProductPrice() * product.getProductSales()); // 상품 판매 금액 =  상품금액 * 상품 판매량
			System.out.println("###########################");
			
			sum+= product.getProductPrice()*product.getProductSales();
		}
		System.out.println("총 판매금액 > " + sum + "원 입니다.");
			
	}
	
	
	
	
	
}
