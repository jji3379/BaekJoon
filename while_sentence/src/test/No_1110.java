package test;

import java.util.Scanner;

public class No_1110 {
	int n;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int first=n;
		int result=0;
		if(n<10) { //n이 10보다 작은경우
			while(true) {
				int a=n*10;
				a=n/10;
				int b=n%10;
				n=a+b%10;
				n=b*10+n%10;
				result++;
				if(first==n) {
					System.out.println(result);
					break;
				}
			}
		}else { //n 이 10보다 큰 경우
			while(true) {
				int a=n/10;
				int b=n%10;
				n=a+b%10;
				n=b*10+n%10;
				result++;
					if(first==n) {
						System.out.println(result);
						break;
					}
			}
			
		}
	}
}
