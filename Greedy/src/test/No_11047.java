package test;

import java.util.Scanner;

public class No_11047 {
	public static void main(String[] args) {
		//최소 동전 개수
		int result1=0;
		
		Scanner scan= new Scanner(System.in);
		int N=scan.nextInt(); 
		int K=scan.nextInt();
		
		//N이 받을 배열
		int[] coin=new int[N];
		
		for(int i=0; i<N; i++) {
			coin[i]=scan.nextInt();
		}
		
		while(K!=0) {		
			for(int j=N-1; j>=0; j--) {
				int cnt=K/coin[j];
				if(cnt>0) {
					result1+=cnt;
					K=K%coin[j];
				}
			}
		}		  
		System.out.println(result1);
	}
}
