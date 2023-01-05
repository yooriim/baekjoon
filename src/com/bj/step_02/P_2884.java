package com.bj.step_02;

import java.util.Scanner;

public class P_2884 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int h=sc.nextInt();
		int m=sc.nextInt();
		
		
		if(h==0) {
			h=24;			
		}
		if(m<45) {
			h=h-1;
			m=m+15;	 //60-45+m			
			
		}else {
			m=m-45;
			if(h==24) h=0;
		}
		System.out.println(h+" "+m);
		
		
		
	}

}
