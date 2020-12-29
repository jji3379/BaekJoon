package test;

import java.util.Scanner;

public class No_1330 {
	public static void main(String[] args) {
		//A와 B를 비교하는 프로그램 작성
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		if(a>b) {
			System.out.println(">");
		}else if(a<b) {
			System.out.println("<");
		}else if(a==b) {
			System.out.println("==");
		}
	}
}
