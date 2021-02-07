package test;

import java.util.Scanner;

public class No_10952 {
	public static void main(String[] args) {
		//A+B -5
		Scanner sc= new Scanner(System.in);
		int a=1;
		int b=1;
		
		while (a>0) {
			a=sc.nextInt();
			b=sc.nextInt();
			int sum=a+b;
			if(a>0 && b>0) {
				break;
			}
			System.out.println(sum);
		}
	}
}
