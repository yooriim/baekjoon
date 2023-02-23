package com.bj.step_01;

import java.util.Scanner;

public class P_10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A+B)%C+"\n"+(((A%C) + (B%C))%C)+"\n"+(A*B)%C+"\n"+(((A%C)*(B%C))%C));
		
	}

}
