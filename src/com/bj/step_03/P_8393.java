package com.bj.step_03;

import java.util.Scanner;

public class P_8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = 0;
		for(int i=1;i<a+1;i++) {
			result+=i;
		}
		System.out.println(result);
	}

}
