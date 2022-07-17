package edu.jungsuck;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		//index 0~2
		String[] strArr = {"가위","바위","보"};
		System.out.println(Arrays.toString(strArr));
		
		for(int i = 0; i<strArr.length;i++) {
			int tmp = (int)(Math.random()*3);
			System.out.println(strArr[tmp]);
		}
	}

}
