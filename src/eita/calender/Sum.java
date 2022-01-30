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
		System.out.println("두 수의 합은 "+(i+j)+"입니다.");
	}
}
