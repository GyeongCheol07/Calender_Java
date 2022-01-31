package eita.calender;

public class Calender {
	
	//평년,윤년 배열
	private static int[] Max_Days = {31,28,31,30,31,30,31,31,30,31,30,31};
	private static int[] Leap_Max_Days = {31,29,31,30,31,30,31,31,30,31,30,31};
	
	//윤년/평년 판단 함수
	public boolean isLeapYear(int year) {
		if(year%4 == 0 && (year%100 != 0 || year%400 == 0)) {
			return true;
		}			
		return false;
	}
	
	//입력한 연도의 해당하는 Max_Days 배열값을 리턴해주는 함수
	public int getMaxDaysOfMonth(int year, int month) {
		if(isLeapYear(year)) {
			return Leap_Max_Days[month-1];
		} else {
			return Max_Days[month-1];
		}
	}
	
	//자동으로 첫번째 요일 계산 함수(1970년1월1일 목요일기준)
	public int getWeekDay(int year, int month) {
		int syear = 1970;
		int standardWeekday = 4;
		
		int count = 0;
		
		//연도 체크
		for(int i=syear ; i<year ; i++) {
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}
		//월 체크
		for(int i=1 ; i<=(month-1) ; i++) {
			int delta = getMaxDaysOfMonth(year, i);
			count += delta;
		}
		
		//요일 추출
		int weekday = (count + standardWeekday) % 7;
		return weekday;
	}
	
	public void printCalender(int year, int month) {
		//고정틀
		System.out.printf("      <<%4d년 %3d월>>   \n", year, month);
		System.out.println("SUN MON TUE WED THU FRI SAT");
		System.out.println("----------------------------");
		
		int weekday = getWeekDay(year,month);
		//공백입력
		if(weekday<7) {
			for(int i=0 ; i<weekday ; i++) {
				System.out.print("    ");
			}
		}
		//날짜입력
		int maxDay = getMaxDaysOfMonth(year, month);
		for(int i=1 ; i<= maxDay ; i++) {
			System.out.printf("%4d",i);
			if(i % 7 == (7-weekday)) {
				System.out.println();
			}
		}
	}
}
