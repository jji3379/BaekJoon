package test;

import java.util.Scanner;

public class No_10871 {
	public static void main(String[] args) {
		//x보다 작은 수
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		
		int[] A=new int[n];
		for (int i = 0; i < n; i++) {
			int b=sc.nextInt();
			A[i]=b;
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i]<x) {
				System.out.println(A[i]);
			}
		}
	}
}