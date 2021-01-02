package test;

import java.util.Scanner;

public class No_14681 {
	public static void main(String[] args) {
		//사분면 고르기
		Scanner scan= new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		if(x>0) {
			if(y>0) {
				System.out.println("1");
			}else {
				System.out.println("4");
			}
		}else {
			if(y>0) {
				System.out.println("2");
			}else {
				System.out.println("3");
			}
		}
		
	}
}
