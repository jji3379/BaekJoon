package test;

import java.util.Scanner;

public class No_2439 {
	public static void main(String[] args) {
		//별 찍기-2
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();		
		for(int i=1; i<=n; i++){ //줄
            for(int j=n; j>0; j--){//개수
	            if(j>i) {
	            	System.out.print(" ");
	            }else {
	            	System.out.print("*");            	
	            }
            }
            System.out.println("");
		}
	}
}
