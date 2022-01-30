package eita.calender;

import java.util.Scanner;

public class Prompt {
	
	private static String PROMPT = "cal> ";
	
	public void runPrompt() {
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		
		Scanner scan = new Scanner(System.in);
		Calender cal = new Calender();
				
		//for문을 이용한 반복 진행(횟수가 정해진 반복)
//		System.out.print("반복 횟수를 입력하세요 : ");
//		int repeat = scan.nextInt();
//		
//		for(int i=0 ; i<repeat ; i++) {
//			System.out.println("월을 입력하세요 : ");
//			System.out.print(prom.PROMPT);
//			int month = scan.nextInt();
//			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
//		}
				
		//while문을 이용한 반복 진행(횟수 정하지 않은 반복)
		while(true) {
			System.out.println("월을 입력하세요(-1입력시 종료)");
			System.out.print(PROMPT);
			int month = scan.nextInt();
			if(month == -1) {
				break;
			}else if(month > 12) {
				System.out.println("다시 입력해주세요.");
				continue;
			}else {
				cal.printCalender(2021, month);
				System.out.println();
			}
		}
		System.out.println("종료합니다.");
		scan.close();
	}

	public static void main(String[] args) {
	
		//달력 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}	
}
