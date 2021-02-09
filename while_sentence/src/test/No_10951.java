package test;

import java.util.Scanner;

public class No_10951 {
	public static void main(String[] args) {
		//A+B -4
		Scanner sc= new Scanner(System.in);
		
		while (sc.hasNextInt()) { //백준에서 NoSuchElement 떠서 이거 써야됨
			int a=sc.nextInt();
			int b=sc.nextInt();
			int sum=a+b;
			System.out.println(sum);
		}
		sc.close();
	}
}
