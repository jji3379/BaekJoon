package test;

import java.util.Scanner;

public class No_2884 {
	public static void main(String[] args) {
		//알람 시계
		
		Scanner sc= new Scanner(System.in);
		int hour=sc.nextInt();
		int min=sc.nextInt();
		
		if(min>=45) {
			min=min-45;
			System.out.println(hour +" "+ min);
		}else{
			if(hour==0) {
				hour=23;
				min=min+15;
				System.out.println(hour +" "+ min);						
			}else {
				hour=hour-1;
				min=min+15;
				System.out.println(hour +" "+ min);							
			}
		}
	}
}
