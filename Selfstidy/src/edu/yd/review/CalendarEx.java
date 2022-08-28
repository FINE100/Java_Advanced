package edu.yd.review;

import java.util.Scanner;


public class CalendarEx {
	Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		CalendarEx cal = new CalendarEx();
		cal.showCalendar();
	}
	// 말일 정보.
	private int getLastDate(int month) { {

			switch (month) {

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;

			case 4:
			case 6:
			case 9:
			case 11:
				return  30;

			case 2:
				return  28;

				}
	}
	return month;
	}
	

	// 1일의 요일정보.
	private int getDayInfo(int month) {
		switch (month) {
		case 1:
			return 6;
		case 2: 
			return 2;
		case 3: 
			return 2;
		case 4:
			return 5;	
		case 5:
			return 0;
		case 6:
			return 3; // 첫째날 요일정보
		case 7:
			return 5;
		case 8:
			return 1;
		case 9:
			return 4;
			
		case 10:
			return 6;
			
		case 11:
			return 2;
			
		case 12:
			return 4;
	
			default:
				return 0;
		}
		
		
	}

	// 달력.

	public void showCalendar() {
		
		System.out.println("월을 입력 >>>>> ");
		int month = Integer.parseInt(scn.nextLine());

		// 요일 정보. 1일의 위치. 말일의 날짜.
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int firstDay = getDayInfo(month); // 일 : 0, 월 : 1, 화 : 2, 수 : 3, 목 : 4, 금 : 5, 토 : 6,
		int lastDate = getLastDate(month);

		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		// 1일의 요일 정보를 맞추도록.
		for (int i = 0; i < firstDay; i++) {
			System.out.printf("%4s", " ");
		}

		for (int i = 1; i <= lastDate; i++) { // 루프 돌려야하는 배열이 아닌 실제 date(1,2,3..31)이므로 1부터 시작
			System.out.printf("%4d", i);
			if ((i + (firstDay)) % 7 == 0) { // 토요일까지 출력했으면 줄 바꿈
				System.out.println();
			}
		}
		System.out.println();
	}

}


