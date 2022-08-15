package print;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter  {
	// System.out.println 과 같은 역할
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("buffer"));
		bw.write("hollo\n"); // 출력. 줄 바꿈 
		bw.newLine(); // 개행 = 엔터
		bw.write("I am a tiger"); //개행과 함께 출력
		bw.flush(); // 남아있는 데이터 모두 출력, 버퍼로 출력하는 거라 넣어줘야함
		bw.close(); // 스트림 닫아주기
		
		

	}

}
