package eita.calender;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		//입력 : 키보드로 두 수를 입력 
		//출력 : 두 수의 합을 화면에 출력한다
		Scanner scan = new Scanner(System.in);
		int i,j;
		System.out.println("두 수를 입력하세요.");
		i = scan.nextInt();
		j = scan.nextInt();
		//System.out.println("두 수의 합은 "+(i+j)+"입니다.");
		System.out.printf("%d와 %d 두 수의 합은 %d입니다.",i,j,i+j);
		
		//Scanner 클래스 종료
		scan.close();
	}
}
