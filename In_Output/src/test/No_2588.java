package test;

import java.util.Scanner;

public class No_2588 {
	public static void main(String[] args) {
		//곱셈 과정
		Scanner scan= new Scanner(System.in);
		String first=scan.next();
		String second=scan.next();
		int firstInt=Integer.parseInt(first);
		int secondInt=Integer.parseInt(second);
		
		char f1=first.charAt(0);
		int f1int=f1-'0';
		char f2=first.charAt(1);
		int f2int=f2-'0';
		char f3=first.charAt(2);
		int f3int=f3-'0';
		
		char s1=second.charAt(0);
		int s1int=s1-'0';
		char s2=second.charAt(1);
		int s2int=s2-'0';
		char s3=second.charAt(2);
		int s3int=s3-'0';
		
		//(3)
		System.out.println(firstInt*s3int);
		//(4)
		System.out.println(firstInt*s2int);
		//(5)
		System.out.println(firstInt*s1int);
		//(6)
		System.out.println(firstInt*secondInt);
	}
}
