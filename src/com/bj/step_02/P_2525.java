package com.bj.step_02;

import java.util.Scanner;

public class P_2525 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int h=sc.nextInt();
		int m=sc.nextInt();
		int a=sc.nextInt();
		
		if(m+a>=60) {
			h=h+(m+a)/60;
			m=(m+a)%60;
			if(h>=24) h=h-24;
		}else{
			m=m+a;			
		}
		System.out.println(h+" "+m);

	}

}
