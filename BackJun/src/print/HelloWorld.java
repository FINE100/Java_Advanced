package print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

	public static void main(String[] args) throws IOException {
	//1. 출력하기
		System.out.println("Hello world!");
	//2. 두줄 출력하기
	System.out.println("강한친구 대한육군");
	System.out.println("강한친구 대한육군");
	//3. 
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String id = "";
	id = br.readLine();
	
	String add = "??!";
	System.out.println(id + add);
	
	}

}
