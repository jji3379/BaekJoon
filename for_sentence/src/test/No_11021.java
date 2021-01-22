package test;

import java.util.Scanner;

public class No_11021 {
	public static void main(String[] args) {
		//A+B -7
		Scanner sc= new Scanner(System.in);
		int T=sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			int sum=A+B;
			
			System.out.println("Case #"+i+": "+sum);
		}
	}
}
