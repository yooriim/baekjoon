package com.bj.step_03;

import java.util.Scanner;

public class P_25314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String result = "";
		for(int i=0;i<a/4;i++) {
			result +="long ";
		}
		System.out.println(result+"int");
		
	}

}
