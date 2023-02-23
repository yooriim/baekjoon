package com.bj.step_01;

import java.util.Scanner;

public class P_2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int n3 = a*(b%10);
		int n4 = a*((b%100)/10);
		int n5 = a*(b/100);
		int n6 = a*b;
		
		
		System.out.println(n3+"\n"+n4+"\n"+n5+"\n"+n6);
			
	}

}
