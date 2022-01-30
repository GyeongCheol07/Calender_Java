package eita.calender;

import java.util.Scanner;

public class Calender {
	
	private static int[] Max_Days = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	//입력한 달의 해당하는 Max_Days배열값을 리턴해주는 함수
	public int getMaxDaysOfMonth(int month) {
		return Max_Days[month-1];
	}
	public void printCalender(int year, int month) {
		System.out.printf("      <<%4d년 %3d월>>   \n", year, month);
		System.out.println("SUN MON TUE WED THU FRI SAT");
		System.out.println("----------------------------");
		int maxDay = getMaxDaysOfMonth(month);
		for(int i=1 ; i<= maxDay ; i++) {
			System.out.printf("%4d",i);
			if(i % 7 == 0) {
				System.out.println();
			}
		}
		
	}
	
	
}
