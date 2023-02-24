package com.bj.step_03;

import java.util.Scanner;

public class P_25304 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int count = sc.nextInt();
		int result = 0;
		for(int i=0;i<count;i++) {
			int price = sc.nextInt();
			int count2 = sc.nextInt();
			result+=price*count2;
		}
		System.out.println(result==total?"Yes":"No");
	}

}
