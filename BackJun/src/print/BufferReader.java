package print;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
	// BufferedReader 사용하는 방법
	public static void main(String[] args) {

		// 예외처리 필수! 아니면 throwsIOException 해주기

		try {

			// 1. 콘솔에서 입력 받을 때
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			br.readLine();

//			 2. 파일에서 입력 받을 때 new FileReader("파일명")
			FileReader fr = new FileReader("BufferTest.txt");
			BufferedReader br_f = new BufferedReader(fr);
			
			// 3. String이 리턴값이라 형변환 필수. 라인단위로 들어감.
			int num = Integer.parseInt(br.readLine());
			br.close(); // 입출력 끝난 후 닫아주기
			
			// 파일을 한줄 한줄 읽어서 출력
			String line = ""; 
			for(int i = 0 ; (line = br_f.readLine()) !=null ; i++) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
