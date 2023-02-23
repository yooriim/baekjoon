package com.bj.step_01;

import java.util.Scanner;

public class P_1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double result = a/b;
		
		System.out.println(Math.round(result*1000000000)/1000000000.0);
		
		
	}

}
