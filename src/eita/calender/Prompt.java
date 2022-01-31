package eita.calender;

import java.util.Scanner;

public class Prompt {
	
	public void runPrompt() {

		//연도,월을 입력받아 달력을 출력하는 프로그램
		Scanner scan = new Scanner(System.in);
		Calender cal = new Calender();
				
		//while문을 이용한 반복 진행(횟수 정하지 않은 반복)
		while(true) {
			System.out.println("연도를 입력하세요.(-1 입력시 종료)");
			System.out.print("YEAR>");
			int year = scan.nextInt();
			if(year == -1) {
				break;
			}
			System.out.println("월을 입력하세요.");
			System.out.print("MONTH>");
			int month = scan.nextInt();
			
			if(month > 12) {
				System.out.println("다시 입력해주세요.");
				continue;
			}else {
				cal.printCalender(year, month);
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
